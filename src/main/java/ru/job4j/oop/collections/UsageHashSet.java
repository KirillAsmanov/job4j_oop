package ru.job4j.oop.collections;

import java.util.HashSet;

/**
 * 0. Set, HashSet, Iterator.[#245017]
 * @author Kirill Asmanov
 * @since 09.04.2020
 * @version 1.0.0;
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("BMW");
        autos.add("Lada");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
