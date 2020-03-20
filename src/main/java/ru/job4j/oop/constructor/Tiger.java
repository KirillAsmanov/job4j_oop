package ru.job4j.oop.constructor;
/**
 * Класс тигров, 1. Конструктор по умолчанию.[#245094]
 * @author Kirill Asmanov
 * @since 20.03.2020
 *
 */
public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("Конструктор тигра");
    }

    public static void main(String[] args) {
        Tiger king = new Tiger();
    }
}
