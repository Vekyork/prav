package ru.geekbrains.lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Obobsheniya {
    public Obobsheniya() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Integer massiv[]  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        swap(massiv,3,4);
        String[] arrayOfStrings = {"One", "Two", "Three", "Four", "Five"};
        toArrayList(arrayOfStrings);

        Fruit[] fruits = {
                new Apple("Яблоко", 1),
                new Orange("Апельсин", 1.5f),
        };

//        for (Fruit: fruits) {
//            Apple.getWeight(fruits);
//            fruits.getWeight();
//        }
//        System.out.println(fruits);
        System.out.println(Orange.compare(new Apple()));
    }

    private static void swap(Integer[] massiv, int a, int b) {
        System.out.println("Begin: " +Arrays.toString(massiv));
        Integer sw = massiv[a];
        massiv[a] = massiv[b];
        massiv[b] = sw;
        System.out.println("End: "+Arrays.toString(massiv));
    }
    public static <T> void toArrayList(T[]arr){

//        List<String> listOfStrings = new ArrayList<>();
//        Collections.addAll(listOfStrings,arr);
//        for (String str : listOfStrings)
//            System.out.print(" " + str);
        ArrayList<T> result = new ArrayList<T>(Arrays.asList(arr));
        System.out.println("Result: " + result);
    }
}

