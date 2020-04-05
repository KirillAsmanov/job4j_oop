package ru.job4j.oop.collections;

import java.util.List;
/**
 * 3. Конвертация ArrayList в двухмерный массив[#245004]
 * @author Kirill Asmanov
 * @since 05.04.2020
 * @version 1.0.0;
 */
public class ConvertListToArray {
    /**
     * Преобразовывает список в двумерный массив, с количеством столбцов, равным параметру cells.
     * Заполняет массив элементами списка
     * @param list - преобразовываемый список
     * @param cells - количество столбцов будущего массива
     * @return - двумерный массив элементов из списка
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        System.out.println(groups);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell++] = num;
            if (cell >= cells) {
                cell = 0;
                row++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 4);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}