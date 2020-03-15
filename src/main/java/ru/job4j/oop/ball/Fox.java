package ru.job4j.oop.ball;
/**
 * Класс, описывающий поведение лисицы. Упр. 1.6. Взаимодействие объектов.[#245087]
 * @author Kirill Asmanov
 * @since 15.03.2020
 * @version 1.0.0;
 */
public class Fox {
    private String name;

    /**
     * Сеттер для имени
     * @param name - имя
     */
    public Fox(String name) {
        this.name = name;
    }

    /**
     * Выводит в консоль реплику при встрече колобка
     */
    public void voice() {
        System.out.println("- Стой, колобок, я " + this.name + ". Подойди поближе, посмотрю на тебя");
    }

    /**
     * Попытка съесть колобка
     * @param ball - колобок
     */
    public void tryEat(Ball ball) {
        this.voice();
        ball.voice(this.name);
        ball.tryEscape(this.name);
    }
}
