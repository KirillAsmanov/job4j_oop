package ru.job4j.oop.collections.sort;

import java.util.Comparator;

import static java.lang.Character.isDigit;

/**
 * 4. Сортировка номера.[#244996]
 * @author Kirill Asmanov
 * @since 16.04.2020
 * @version 1.0.0;
 */
public class LexSort implements Comparator<String> {
    /**
     * Сравнивает строки по номеру в начале строки
     * @param left - первая строка с номером
     * @param right - вторая страка с номером
     * @return compare -1 / 0 / 1
     */
    @Override
    public int compare(String left, String right) {
        int leftNumber = Integer.parseInt(left.split(". ")[0]);
        int rightNumber = Integer.parseInt(right.split(". ")[0]);
        return Integer.compare(leftNumber, rightNumber);
    }
}