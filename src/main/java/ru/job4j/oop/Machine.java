package ru.job4j.oop;

import java.util.Arrays;
/**
 * Упр. Сдача в кофе-машине. [#34741]
 * @author Kirill Asmanov
 * @since 29.03.2020
 * @version 1.0.0;
 */
public class Machine {
    /**
     * содержит массив возможных монет
     */
    private final int[] coins = {10, 5, 2, 1};

    /**
     * Заполняет массив значениями монет сдачи
     * @param money - деньги, вставленные в аппарат
     * @param price - цена продукта
     * @return - массив, состоящий из монет сдачи
     */
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int index = 0; index < coins.length; index++) {
            while ((money - coins[index]) >= 0) {
                money -= coins[index];
                rsl[size++] = coins[index];
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] change = new Machine().change(100, 32);
        for (int i = 0; i < change.length; i++) {
            System.out.println(change[i]);
        }
    }
}
