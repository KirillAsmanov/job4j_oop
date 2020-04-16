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
        int rsl;
        int leftPosition = 0;
        int rightPosition = 0;
        while (isDigit(left.charAt(leftPosition))) {
            leftPosition++;
        }
        while (isDigit(right.charAt(rightPosition))) {
            rightPosition++;
        }
        return Integer.compare(Integer.parseInt(left.substring(0, leftPosition)), Integer.parseInt(right.substring(0, rightPosition)));
    }
}