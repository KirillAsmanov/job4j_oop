package ru.job4j.oop.collections;

import java.util.ArrayList;
import java.util.List;
/**
 * 4. Конвертация двумерного массива в ArrayList[#245003]
 * @author Kirill Asmanov
 * @since 05.04.2020
 * @version 1.0.0;
 */
public class ConvertMatrixToList {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
