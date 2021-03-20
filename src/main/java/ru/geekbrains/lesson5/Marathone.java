package ru.geekbrains.lesson5;

public class Marathone {
    public static void main(String[] args) {
        //Создать классы Собака и Кот с наследованием от класса Животное.
        //Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        // Результатом выполнения действия будет печать в консоль.
        // (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        //У каждого животного есть ограничения на действия
        // (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        //Добавить подсчет созданных котов, собак и животных.
        Animals[] animals = {
                new Cat("Barsik","Black", 5, 100, 1),
                new Dog("Tuzik", "Grey", 15, 150, 9),
        };

        for (Animals a : animals) {
            a.run(200);
            a.swim(10);
//            System.out.println(a.getSomeField());

        }

        Animals o = new Cat("", "Grey", 10, 1, 3);

        Cat c = (Cat) o;
        if (o instanceof Cat) ((Cat) o).swim(100);

        System.out.println("There were " + Cat.getCounter() + " Cats");
        System.out.println("There were " + Dog.getCounter() + " Dogs");
        System.out.println("There were " + Animals.getCounter() + " Animals");

    }
}