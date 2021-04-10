package ru.geekbrains.lesson11;

public class Fruit {
    public String name;
    public float weight;

    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    public boolean compareByWeight(Fruit b2) {
        if(getWeight() == b2.getWeight()) return true;
        return false;
    }

    public boolean compareByType(Fruit b2) {
        if(this.getClass() == b2.getClass()) return true;
        return false;
    }

    public boolean compareByTypeAndWeight(Fruit b2) {
        if(getWeight() == b2.getWeight()) return true;
        return false;
    }
    public Fruit() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void getWeight(float weight) {
        this.weight += weight;
    }
}
