package ru.geekbrains.lesson11;

public class Apple extends Fruit{
    public String name;
    public float weight;

    public Apple(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public Apple() {
    }

    public void getWeight(float weight) {
        this.weight += weight;
    }
}
