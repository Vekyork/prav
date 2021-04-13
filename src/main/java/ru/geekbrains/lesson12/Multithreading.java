package ru.geekbrains.lesson12;

import java.util.Arrays;

public class Multithreading {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    public float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

    public void runOneThread() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;
        long a = System.currentTimeMillis();
        calculate(arr);
        System.out.println("Время заполнения первого массива: " + (System.currentTimeMillis() - a) + " миллисекунд(ы)");
    }

    public void runTwoThreads() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        new Thread() {
            public void run() {
                float[] a1 = calculate(arr1);
                System.arraycopy(a1, 0, arr1, 0, a1.length);
            }
        }.start();

        new Thread() {
            public void run() {
                float[] a2 = calculate(arr2);
                System.arraycopy(a2, 0, arr2, 0, a2.length);
            }
        }.start();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        System.out.println("Два потока закончились через: " + (System.currentTimeMillis() - a) + " миллисекунд(ы)");
        System.out.println(SIZE);
        System.out.println(HALF);
//        System.out.println(Arrays.toString(new float[SIZE]));
//        System.out.println(Arrays.toString(new float[HALF]));
    }

    public static void main(String s[]) {
        Multithreading o = new Multithreading();
        o.runOneThread();
        o.runTwoThreads();
    }
}
