package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0.
        //System.out.println(resArr.toString(arr));
        //resArr(arr);
        //System.out.println(arr.toString(arr));
        //private static void resArr(int[] arr) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

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

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.
    private static int[] array() {
        int step = 3;
        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * step;
            System.out.println(arr1[i]);
        }
        return arr1;
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа, меньшие 6, умножить на 2.
    private static int[] six() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
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

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
    private static int[][] diagonalArr(int size, int value) {
        int[][] diagonalArr = diagonalArr(3, 1);
        System.out.println(diagonalArr);
        return diagonalArr;
    }

    //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета).
    private static int[] minMaxArr() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -100};
        int min = arr3[0];
        int max = arr3[12];
        for (int x : arr3) {
            if (x < min) min = x;
        }
        for (int y : arr3) {
            if (y > max) max = y;
        }
        System.out.println("Минимальный элемент: " + min + "Максимальный элемент: " + max);
        return arr3;
    }


//    private static int[] minMax() {
//        int[] minMaxArr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -100 };
//        int min = minMaxArr1()[];
//        int max = minMaxArr1()[];
//        System.out.printf(min, max);
//    }
//}
//** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.
    static boolean checkBalance(int[] arr4) {
    int sum = 0;
//    int[] arr4 = arr4(2, 2, 2, 1, 2, 2, 10, 1);
    for (int i = 0; i< arr4.length; i++) {
        sum = sum + arr4[i];
    }
        if (sum % 2 != 0) return  false;
        sum /= 2;
        int left = 0;
        for (int i: arr4) {
            left += i;
            if (left == sum) return true;
            System.out.println("Левая часть больше");
            if (left > sum) return false;
            System.out.println("Правая часть больше");
            }
        return false;
        }
//    static void printArr(int[][] arr) {...}
//**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
// или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
// Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
// при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    static  void  shift(int[] arr5, int n){
        int shift = (arr5.length + n % arr5.length) % arr5.length;
        for (int i = 0; i < shift; i++) {
            int temp = arr5[arr5.length - 1];
            for (int j = arr5.length - 1; j > 0; j--) {
                arr5[j] = arr5[j - 1];
            }
            arr5[0] = temp;
        }
    }
}