package ru.geekbrains.lesson8;

import java.io.IOException;
import java.util.InputMismatchException;

public class Exceptions {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"2", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (InputMismatchException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (IOException e) {
            System.out.println("Неправильное значение массива!");
//            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }
    public static int method(String[][] arr) throws InputMismatchException, IOException {
        int count = 0;
        if (arr.length != 4) {
            throw new InputMismatchException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new InputMismatchException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (StackOverflowError e) {
                    throw new StackOverflowError();
                }
            }
        }
        return count;
    }
}
