package ru.geekbrains.lesson10;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        String[] numbers = {
                "One", "Two", "Three",
                "Four", "Five", "Six",
                "Seven", "Seven", "Seven",
                "Eight", "Nine", "Eight",
                "Ten", "Eleven", "Twelve"
        };
        for (int i = 0; i < numbers.length; i++) {
            if (hm.containsKey(numbers[i]))
                hm.put(numbers[i], hm.get(numbers[i]) + 1);
            else
                hm.put(numbers[i], 1);
        }
        System.out.println(hm);
    }
}
