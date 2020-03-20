package ru.job4j.oop.constructor;
/**
 * Класс тигров, 1. Конструктор по умолчанию.[#245094]
 * 2. Перегрузка конструктора.[#245095]
 * @author Kirill Asmanov
 * @since 20.03.2020
 *
 */
public class Tiger extends Predator {
    /**
     * Конструктор по умолчанию
     */
    public Tiger() {
        super();
        System.out.println("Конструктор тигра");
    }

    /**
     * Перегруженный конструктор с инициализацией поля name
     * @param name - имя
     */
    public Tiger(String name) {
        super(name);
        System.out.println("Конструктор тигра с именем");
    }

    public static void main(String[] args) {
        Tiger king = new Tiger();
        System.out.println("--------------------------------------");
        Tiger leopold = new Tiger("Леопольд");
        System.out.println(leopold.name);
    }
}
