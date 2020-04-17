package ru.job4j.oop.collections.sort;

import java.util.Comparator;
/**
 * Отсортировать департаменты[#244992]
 * Реализует компаратор для сортировки по убыванию главных департаментов, но по возрастанию их побочных
 * @author Kirill Asmanov
 * @since 17.04.2020
 * @version 1.0.0;
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = right.split("/", 2)[0].compareTo(left.split("/", 2)[0]);
        return (rsl == 0) ? left.compareTo(right) : rsl;
    }
}
