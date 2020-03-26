package ru.job4j.oop.strategy;
/**
 * 7. Шаблон проектирования - Стратегия.[#245064]
 * @author Kirill Asmanov
 * @since 015.03.2020
 * @version 1.0.0;
 */
public class Paint {
    /**
     * Рисует в консоль переданную в него фигуру
     * @param shape - фигура, которая будет выводиться
     */
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {

    }
}
