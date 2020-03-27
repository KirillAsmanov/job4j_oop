package ru.job4j.oop.exception;

import java.util.Arrays;

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        // Как я понял, цель этого метода - инвертировать массив
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            // Обе ошибки были допущены в этих участках [names.length - index];
            // При index = 0 эта операция брала элемент с индексом 4,
            // тогда как последний индекс был равен 3
            names[index] = names[names.length - 1 - index];
            names[names.length - 1 - index] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}