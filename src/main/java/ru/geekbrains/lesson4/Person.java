package ru.geekbrains.lesson4;

import java.time.Year;

public class Person {
    static String someField = "Static field";
    private static int counter = 0;
    private static int age;
    private String fio;
    private String doljnost;
    private String email;
    private String telefon;
    private int zarplata;
//    private int age;


//    static Person[] doStatic(String fio, String doljnost, String email, String telefon, int zarplata, int age){
//        Person[] persArray = new Person[5];
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        persArray[1] = new Person("Petrov Petr", "Military", "petrov.p@mailbox.com", "891600000", 28000, 45);
//        persArray[2] = new Person("Nikolaev Nikolay", "Driver", "nikolaev.n@mailbox.com", "890100000", 32000, 28);
//        persArray[3] = new Person("Vetrov Vasily", "Worker", "vetrov.v@mailbox.com", "895100000", 20000, 18);
//        persArray[4] = new Person("Sidorov Stepan", "Scientist", "sidorov.s@mailbox.com", "890300000", 100000, 54);
//
//        return persArray;
//    }

    public Person(String fio, String doljnost, String email, String telefon, int zarplata, int age) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Military", "petrov.p@mailbox.com", "891600000", 28000, 45);
        persArray[2] = new Person("Nikolaev Nikolay", "Driver", "nikolaev.n@mailbox.com", "890100000", 32000, 28);
        persArray[3] = new Person("Vetrov Vasily", "Worker", "vetrov.v@mailbox.com", "895100000", 20000, 18);
        persArray[4] = new Person("Sidorov Stepan", "Scientist", "sidorov.s@mailbox.com", "890300000", 100000, 54);
        System.out.println(persArray);
//        this.fio = fio;
//        this.doljnost = doljnost;
//        this.email = email;
//        this.telefon = telefon;
//        this.zarplata = zarplata;
//        this.age = age;
//    }
//        public void info() {
        int i = 0;
        for (i = 0; i < persArray.length; i++) {
            System.out.println(persArray[i]);
            if (age > 40) {
                System.out.println(persArray[i]);
            }
        }
//        public static class MainClass {
//            public static void main(String[] args) {
//
//            }
//        }
    }
    public int getAge() {
        return Person.age;
    }

}




