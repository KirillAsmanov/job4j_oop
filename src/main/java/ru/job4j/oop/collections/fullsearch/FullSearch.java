package ru.job4j.oop.collections.fullsearch;

import java.util.HashSet;
import java.util.List;
/**
 * 1. Уникальные задачи.[#245014]
 * @author Kirill Asmanov
 * @since 09.04.2020
 * @version 1.0.0;
 */
public class FullSearch {
    /**
     * Записывет номера задач в HashSet, убирая повторяющиеся номера
     * @param list - список задач
     * @return - HashSet список с уникальными значениями
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
