package ru.geekbrains.lesson11;

public class Orange extends Fruit{
    public String name;
    public float weight;

    public Orange(String name, float weight) {
        super();
        this.name = name;
        this.weight = weight;
    }

    public static boolean compare(Apple apple) {
        return false;
    }

    public void getWeight(float weight) {
        this.weight += weight;
    }
}
