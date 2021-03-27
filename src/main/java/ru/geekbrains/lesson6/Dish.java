package ru.geekbrains.lesson6;

public class Dish extends AbstractBowl{

    public void decreaseFood(int amount) {
        super.decreaseFood(amount);
        System.out.println("Food from dish decreased, now there is " + super.getFood());
    }

}