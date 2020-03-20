package ru.job4j.oop.constructor;
/**
 * Класс животного, 1. Конструктор по умолчанию.[#245094]
 * 2. Перегрузка конструктора.[#245095]
 * @author Kirill Asmanov
 * @since 20.03.2020
 */
public class Animal {
    String name;

    /**
     * Конструктор по умолчанию
     */
    public Animal() {
        super();
        System.out.println("Конструктор животного");
    }

    /**
     * Перегруженный конструктор с инициализацией поля name
     * @param name - имя
     */
    public Animal(String name) {
        this.name = name;
        System.out.println("Конструктор животного с именем");
    }
}
