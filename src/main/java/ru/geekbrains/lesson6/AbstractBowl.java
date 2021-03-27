package ru.geekbrains.lesson6;

public abstract class AbstractBowl {
    private int food;

    public void putFood(int amount) {
        this.food += amount;
    }

    public void decreaseFood(int amount) {
        this.food -= amount;
            if (this.food <= 0){
                this.food = 0;
            }
    }

    public int getFood() {
        return this.food;
    }
}
