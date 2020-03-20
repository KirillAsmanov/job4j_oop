package ru.job4j.oop.profession;
/**
 * Класс для диагноза
 * Упр. 3. Реализация профессий в коде[#245099]
 * @author Kirill Asmanov
 * @since 20.03.2020
 * @version 1.0.0;
 */
public class Diagnose {
    private String name;

    /**
     * Конструктор
     * @param name - название заболевания
     */
    public Diagnose(String name) {
        this.name = name;
    }

    /**
     * Геттер
     * @return имя
     */
    public String getName() {
        return name;
    }
}
