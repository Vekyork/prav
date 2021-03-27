package ru.geekbrains.lesson6;

public class CatBowl extends AbstractBowl{

    public void decreaseFood(int amount) {
        super.decreaseFood(amount);
        System.out.println("Food from cat bowl decreased, now there is " + super.getFood());
    }

}