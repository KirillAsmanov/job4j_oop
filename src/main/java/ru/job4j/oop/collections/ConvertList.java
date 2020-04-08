package ru.job4j.oop.collections;

import java.util.ArrayList;
import java.util.List;
/**
 * 5. Конвертация листа массивов в один лист Integer[#245005]
 * @author Kirill Asmanov
 * @since 07.04.2020
 * @version 1.0.0;
 */
public class ConvertList {
    /**
     * Конвертирует список из массивов, заполненных целочисленными значениями в список этих значений
     * @param list - список массивов
     * @return - список целочисленных значений
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] arr : list) {
            for (int number : arr) {
                rsl.add(number);
            }
        }
        return rsl;
    }
}
