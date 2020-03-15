package ru.job4j.oop;
/**
 * Класс с котиками. Упр. 1.5. Поля объекта[#245084]
 * @author Kirill Asmanov
 * @since 015.03.2020
 * @version 1.0.0;
 */
public class Cat {
    private String food;
    private String name;

    /**
     * Метод, выводящий информацию о кличке котика и о том, что он кушает
     */
    public void show() {
        System.out.println("Котик по имени " + this.name + " кушает " + this.food);
    }

    /**
     * Сеттер для клички котика
     * @param nick - кличка
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Сеттер для вкусовых предпочтений котика
     * @param meat - еда
     */
    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Тьма");
        black.eat("fish");
        black.show();
    }
}