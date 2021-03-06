package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {
//       public static void resArr(int[] arr) {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
                //resArr[i] ^= 1;
                //resArr[i] = (resArr[i] + 1 ) % 2;
                //resArr[i] = (resArr[i] - 1 ) * -1;
            }
            System.out.println(arr[i]);
        }
    }

    private static int[] array() {
        int step = 3;
        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * step;
        }
        return arr1;
//       System.out.println(arr1[i]);
    }

    private static int[] six() {
    int arr2[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr2.length; i++) {
        if (arr2[i] < 6) {
            arr2[i] = arr2[i] * 2;
        } else {
            arr2[i] = 1;
        }
            System.out.println(arr2[i]);
//            printArr(arr2);
    }
        return arr2;
}
//    int[][] diagonalArr = diagonalArr(size: 3; value: 1);
//    System.out.println("");
//    printArr(diagonalArr);
}
