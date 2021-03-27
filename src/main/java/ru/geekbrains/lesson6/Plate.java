package ru.geekbrains.lesson6;

public class Plate extends AbstractBowl {

    public void decreaseFood(int amount) {
        super.decreaseFood(amount);
        System.out.println("Food from plate decreased, now there is " + super.getFood());
    }

}
