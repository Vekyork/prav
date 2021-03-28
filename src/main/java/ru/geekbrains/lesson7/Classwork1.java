package ru.geekbrains.lesson7;

import ru.geekbrains.lesson6.Cat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Classwork1 {

    private static Object Participate;

    public static void main(String[]args) {

        CatCat Wh = new CatCat("Mr. Wh", 30, 1) {
        };
        Human John = new Human("Mr. John", 100, 2) {
        };
        Robot AI = new Robot("Mr. AI", 500, 5) {
        };

        System.out.println("CatCat running and jumping\n" + args.toString());
        System.out.println("Human running and jumping\n" + new Human());
        System.out.println("Robot running and jumping\n" + new Robot());

//        for (CatCat) {
//            CatCat.run(Road());
//        }
//        for (CatCat) {
//            CatCat.jump.(Wall);
//        }
//        for (Human) {
//            Human.run(Road);
//        }
//        for (Human) {
//            Human.jump(Wall);
//        }
//        for (Robot) {
//            Robot.run(Road);
//        }
//        for (Robot) {
//            Robot.jump(Wall);
//        }

        System.out.println("CatCat running in the Road and jumping on the Wall\n" + new CatCat());
        System.out.println("Human running in the Road and jumping on the Wall\n" + new Human());
        System.out.println("Robot running in the Road and jumping on the Wall\n" + new Robot());

        class participation {
            Participate[] participations = {
                    new Participate("123", 100, 1),
                    new Participate("234", 150, 2),
                    new Participate("345", 200, 3),
            };
//        for (CatCat) {
//        CatCat.run(Road());
        }
        System.out.println("participations: " + Participate);
        System.out.println("args = " + new CatCat());
    }
}

//
//        CatCat.run();
//        CatCat.jump();
//
//        Runnable Human = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//
//            public void run(int lenght) {
//
//            }
//
//            public void run(int lenght) {
//            }
//            @Override
//            public void jump() {
//                System.out.println("Anonymous CatCat Running");
//
//            }
//        };
//        Human.run();
//        Human.j();
//            @Override
//            public void fly(int length) {
//                System.out.println("Anonymous butterfly flying");
//            }
//
//            @Override
//            public void land() {
//                System.out.println("Anonymous butterfly landing");
//
//            }
//        };
//
//        butterfly.fly(10);
//        butterfly.land();
//
//        Walking walker = () -> System.out.println("Hello!");
//
//
//        walker.walk();
//
////        public void Partisipate(){
////            Partisipate[] Participate = {
////                    CatCat = new CatCat("w", ),
////                    Human = new Human("Mr. John", 500, 2),
////                    Robot = new Robot("Mr.AI", 5000, 5)
////            };
////            System.out.println("AI %s had run Human %s had run CatCat %s\n" + Participate);
//        String name;
////        System.out.println("SomeCat\n" + name + run(10););
//        }