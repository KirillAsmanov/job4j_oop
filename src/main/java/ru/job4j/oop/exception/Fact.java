package ru.job4j.oop.exception;

/**
 * Упр. 0.2. Кидаем исключение - throw new RuntimeException[#245070]
 * @author Kirill Asmanov
 * @since 27.03.2020
 * @version 1.0.0;
 */
public class Fact {
    public static void main(String[] args) {
        System.out.println(new Fact().calc(3));
        System.out.println(new Fact().calc(-4));
    }

    /**
     * Возвращает факториал входящего числа
     * @param n - число
     * @return - факториал числа
     * @exception IllegalArgumentException кидаем, если n < 0
     */
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument should be greater than ");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
