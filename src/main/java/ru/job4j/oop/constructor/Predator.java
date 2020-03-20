package ru.job4j.oop.constructor;

/**
 * Класс хищников, 1. Конструктор по умолчанию.[#245094]
 * 2. Перегрузка конструктора.[#245095]
 * @author Kirill Asmanov
 * @since 20.03.2020
 *
 */
public class Predator extends Animal {
    /**
     * Перегруженный конструктор с инициализацией поля name
     * @param name - имя
     */
    public Predator(String name) {
        super(name);
        System.out.println("Конструктор хищника c именем");
    }

    /**
     * Конструктор по умолчанию
     */
    public Predator() {
        super();
        System.out.println("Конструктор хищника");
    }
}
