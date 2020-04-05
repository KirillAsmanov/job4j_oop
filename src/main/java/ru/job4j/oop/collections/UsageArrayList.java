package ru.job4j.oop.collections;

import java.util.ArrayList;

/**
 * 0. Коллекции, ArrayList, List, Обобщения[#245007]
 * @author Kirill Asmanov
 * @since 05.04.2020
 * @version 1.0.0;
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Петр");
        names.add("Иван");
        names.add("Степан");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
