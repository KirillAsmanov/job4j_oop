package ru.job4j.oop.strategy;

import java.util.StringJoiner;
/**
 * Класс квадрата
 * 7. Шаблон проектирования - Стратегия.[#245064]
 * @author Kirill Asmanov
 * @since 015.03.2020
 * @version 1.0.0;
 */
public class Square implements Shape {
    /**
     * Рисует в консоль фигуру
     * @return - возвращает фигуру в псевдографике
     */
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
        pic.add("+ + + +");
        pic.add("+     +");
        pic.add("+     +");
        pic.add("+ + + +");
        return pic.toString();
    }
}
