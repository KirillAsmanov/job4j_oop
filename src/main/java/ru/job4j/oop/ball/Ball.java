package ru.job4j.oop.ball;
/**
 * Класс, описывающий поведение колобка. Упр. 1.6. Взаимодействие объектов.[#245087]
 * @author Kirill Asmanov
 * @since 15.03.2020
 * @version 1.0.0;
 */
public class Ball {
    /**
     * Выводит в консоль реплику колобка при встрече персонажа
     * @param name - имя встреченного персонажа
     */
    public void voice(String name) {
        if (name.equals("Лиса")) {
            System.out.println("- Привет, " + name + " я иду!");
        } else {
            System.out.println("- Я от бабушки ушел, я от дедушки ушел, и от тебя, " + name + ", уйду.");
        }
    }

    /**
     * Реализует попытку колобка сбежать от встреченного персонажа
     * @param name - имя встреченного персонажа
     */
    public void tryEscape(String name) {
        if (name.equals("Лиса")) {
            System.out.println("И проглотила " + name + " колобка...");
        } else {
            System.out.println("И был таков...");
        }
    }
}
