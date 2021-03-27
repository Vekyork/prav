package ru.geekbrains.lesson6;

public class Tarelka extends AbstractBowl {

    public void decreaseFood(int amount) {
        super.decreaseFood(amount);
        System.out.println("Food from tarelka decreased, now there is " + super.getFood());
    }

    @Override
    public int getFood() {
        return super.getFood();
    }
}
