package ru.job4j.oop.strategy;
/**
 * Интерфейс фигуры
 * 7. Шаблон проектирования - Стратегия.[#245064]
 * @author Kirill Asmanov
 * @since 015.03.2020
 * @version 1.0.0;
 */
public interface Shape {
    /**
     * Рисует в консоль фигуру
     * @return - возвращает фигуру в псевдографике
     */
    String draw();
}
