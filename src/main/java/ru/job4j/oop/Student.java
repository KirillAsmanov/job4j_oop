package ru.job4j.oop;
/**
 * Класс студента музыкальной школы. Упр. 1.2. Вызов метода объекта[#245085]
 * @author Kirill Asmanov
 * @since 015.03.2020
 * @version 1.0.0;
 */
public class Student {
    /**
     * Метод, который выводит в консоль игру на баяне
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Метод, который выводит в консоль песню
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

    /**
     * точка входа
     * @param args - args
     */
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
