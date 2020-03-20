package ru.job4j.oop.constructor;

/**
 * Класс хищников, 1. Конструктор по умолчанию.[#245094]
 * @author Kirill Asmanov
 * @since 20.03.2020
 *
 */
public class Predator extends Animal {
    public Predator() {
        super();
        System.out.println("Конструктор хищника");
    }
}
