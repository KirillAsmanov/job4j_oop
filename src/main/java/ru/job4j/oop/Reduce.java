package ru.job4j.oop;
/**
 * 5.1. Зона видимости переменных.[#245090]
 * @author Kirill Asmanov
 * @since 19.03.2020
 * @version 1.0.0;
 */
public class Reduce {
    private int[] array;

    // Ошибка содержалась в данном участке. Отсутствовало ключевое слово this, которое указывало бы на запись
    // не в локальную переменную array, а в поле array класса Reduce
    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
