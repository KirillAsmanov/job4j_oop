package ru.job4j.oop;
/**
 * Упр. 3. Перегрузить метод max для трех чисел[#245082]
 * @author Kirill Asmanov
 * @since 19.03.2020
 * @version 1.0.0;
 */

public class Max {
    /**
     * Осуществляет поиск максимального числа из двух входных чисел
     * @param first - первое
     * @param second - второе
     * @return максимальное
     */
    public static int max(int first, int second) {
        int result = first >= second ? first : second;
        return result;
    }
    /**
     * Осуществляет поиск максимального числа из трех входных чисел
     * @param first - первое
     * @param second - второе
     * @param third - третье
     * @return максимальное
     */
    public static int max(int first, int second, int third) {
        int result = first >= Max.max(second, third) ? first : Max.max(second, third);
        return result;
    }

    /**
     * Осуществляет поиск максимального числа из четырех входных чисел
     * @param first - первое
     * @param second - второе
     * @param third - третье
     * @param fourth - четвертое
     * @return максимальное
     */
    public static int max(int first, int second, int third, int fourth) {
        int result = first >= Max.max(second, third, fourth) ? first : Max.max(second, third, fourth);
        return result;
    }

}