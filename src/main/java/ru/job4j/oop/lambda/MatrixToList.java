package ru.job4j.oop.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 5. Преобразование матрицы чисел в список чисел.[#244877]
 * @author Kirill Asmanov
 * @since 24.04.2020
 * @version 1.0.0;
 */
public class MatrixToList {
    /**
     * Извлекает числа из двумерного списка и записывает в обычный список
     * @param matrix - многомерный список
     * @return - одномерный список чисел
     */
    public static List<Integer> matrixToFlat(List<List<Integer>> matrix) {
        return matrix.stream().
                flatMap(Collection::stream).
                collect(Collectors.toList());
    }

    /**
     * Перегруженный для массивов метод matrixToFlat.
     * Извлекает числа из двумерного массива и записывает в обычный список
     * @param matrix - многомерный массив
     * @return - одномерный список чисел
     */
    public static List<Integer> matrixToFlat(Integer[][] matrix) {
        return Arrays.stream(matrix).
                flatMap(Arrays::stream).
                collect(Collectors.toList());
    }
}
