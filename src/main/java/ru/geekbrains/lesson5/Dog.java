package ru.geekbrains.lesson5;

public class Dog extends Animals {
    String name;

    public Dog(String name, String color, int age, int run, int swim) {
        super(name, color, age, run, swim);
        this.type = "Dog";
    }

    @Override
    public void r() {
        System.out.printf("Dog %s running!\n", super.name);
    }
    public void sw() {
        System.out.printf("Dog %s swimming!\n", super.name);
    }
}
