package ru.geekbrains.lesson13;

import javafx.event.EventTarget;

public interface Runnable extends EventTarget {
    void go(Car c);
}
