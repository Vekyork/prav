package ru.geekbrains.lesson13;

import edu.emory.mathcs.backport.java.util.concurrent.CountDownLatch;
import edu.emory.mathcs.backport.java.util.concurrent.CyclicBarrier;
import edu.emory.mathcs.backport.java.util.concurrent.locks.ReentrantLock;

import java.util.concurrent.locks.Lock;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private static boolean winnerFound;
    private static Lock win = (Lock) new ReentrantLock();

    static {
        CARS_COUNT = 0;
    }

    private Race race;
    private int speed;
    private String name;
    private int count;
    private CyclicBarrier cb;
    private CountDownLatch cdl;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCount() {
        return count;
    }

    public Car(Race race, int speed, CyclicBarrier cb, CountDownLatch cdl) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cb = cb;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
            cb.await();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }
            checkWinner(this);
//1 способ проверки
//            synchronized (win) {
//                cdl.countDown();
//                if (cdl.getCount() == 1)
//                    System.out.println(this.name + " - WIN");
//            }
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //2 способ проверки
    private static synchronized void checkWinner(Car c) {
        if (!winnerFound) {
            System.out.println(c.name + " - WIN");
            winnerFound = true;
        }
    }
}