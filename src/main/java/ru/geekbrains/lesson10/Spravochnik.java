package ru.geekbrains.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spravochnik {
    public static void main(String[] args) {
        Map<String, Integer> spravochnik_hm = new HashMap<>();
        List<String> phones_list;
        spravochnik_hm.put("Petrov", 8901);
        spravochnik_hm.put("Ivanov", 8902);
        spravochnik_hm.put("Ivanov", 8903);
        spravochnik_hm.put("Sidorov", 8904);
        spravochnik_hm.put("Popov", 8905);
        spravochnik_hm.put("Popov", 8906);
        spravochnik_hm.put("Vasiliev", 8907);
        System.out.println(spravochnik_hm);

        class Note {
            private Map<String, List<String>> spravochnik_hm = new HashMap<>();
            private List<String> phones_list;

            public void add(String surname, String phones) {
                if (spravochnik_hm.containsKey(surname)) {
                    phones_list = spravochnik_hm.get(surname);
                    phones_list.add(phones);
                    spravochnik_hm.put(surname, phones_list);
                } else {
                    phones_list = new ArrayList<>();
                    phones_list.add(phones);
                    spravochnik_hm.put(surname, phones_list);
                }
            }
            public List<String> get(String surname) {
                return spravochnik_hm.get(surname);
            }
        }
    }
}