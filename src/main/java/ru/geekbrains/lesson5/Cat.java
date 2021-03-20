package ru.geekbrains.lesson5;

public class Cat extends Animals{
    public Cat(String name, String color, int age, int run, int swim) {
        super(name, color, age, run, swim);
        this.type = "Cat";
    }

//    @Override
//    public void swim() {
//        System.out.printf("Cat %s swimming!\n", this.name);
//    }
//
//    @Override
//    public void run() {
//        System.out.printf("Cat %s running!\n", this.name);
//    }
}
