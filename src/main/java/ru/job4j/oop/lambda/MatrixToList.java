package ru.job4j.oop.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {
    public static void main(String[] args) {
        /**
         * Из многомерного списка
         */
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        List<Integer> list = matrix.stream().flatMap(Collection::stream).collect(Collectors.toList());

        /**
         * Из многомерного массива
         */
        Integer[][] arrayMatrix = {
                {1, 2},
                {3, 4}
        };
        List<Integer> convertList = Arrays.stream(arrayMatrix).flatMap(Arrays::stream).collect(Collectors.toList());
        convertList.forEach(System.out::println);
    }
}
