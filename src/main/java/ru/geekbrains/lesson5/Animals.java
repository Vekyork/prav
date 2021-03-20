package ru.geekbrains.lesson5;

import java.util.Objects;

public abstract class Animals extends Object {
    protected static int counter;
    protected String name;
    protected String color;
    protected int age;
    private int maxRunDistance;
    private int maxSwimDistance;
    protected String type;
    protected String someField;
//    protected int dogRun = 100;
//    protected int catRun = 50;
//    protected int maxDogRun = 500;
//    protected int maxCatRun = 200;
//    protected int dogSwim  =5;
//    protected int catSwim = 0;
//    protected int maxDogSwim = 10;
//    protected int maxCatSwim = 1;

    public Animals() {
//        for (int j = 0; j < .length; j++) {
//            System.out.println(catRun);
//                if (catRun < maxCatRun) {
//                    System.out.println(catRun);
//                }else {return;}
            }

    public Animals(String name, String color, int age, int maxrun, int maxswim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRunDistance = maxrun;
        this.maxSwimDistance = maxswim;
        this.someField = "Animals";
        counter++;
        }

    public void r() {
        System.out.printf("%s %s walking on its paws!\n",this.type);
    }

    public void sw() {
        System.out.printf("%s %s swimming!\n",this.type);
    }
//    public abstract void voice();

    @Override
    public String toString() {
        return String.format("Animal %s\nname: %s\ncolor: %s\nage: %d", this.type, this.name, this.color, this.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animal = (Animals) o;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                Objects.equals(color, animal.color) &&
                Objects.equals(type, animal.type);
//                &&
//                Objects.equals(run, animal.run) &&
//                Objects.equals(swim, animal.swim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age, type);
    }
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.printf("%s %s run %d meters\r\n", type, name, distance);
        } else System.out.printf("%s %s could not run %d meters\r\n", type, name, distance);
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.printf("%s %s swimmed %d meters\r\n", type, name, distance);
        } else System.out.printf("%s %s could not swim %d meters\r\n", type, name, distance);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public void setMaxSwimDistance(int maxSwimDistance) {
        this.maxSwimDistance = maxSwimDistance;
    }

    public static int getCounter() {
        return counter;
    }

    public String getSomeField() {
        return someField;
    }
}