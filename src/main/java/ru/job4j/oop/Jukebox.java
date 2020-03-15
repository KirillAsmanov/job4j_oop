package ru.job4j.oop;
/**
 * Упр. 1.3. Вызов метода с аргументами.[#245086]
 * @author Kirill Asmanov
 * @since 015.03.2020
 * @version 1.0.0;
 */
public class Jukebox {
    /**
     * Метод реализует вывод в консоль песни, в зависимости от входного параметра
     * @param position - число, на основе которого происходит выбор песни
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox sharmanka = new Jukebox();
        sharmanka.music(1);
        sharmanka.music(2);
        sharmanka.music(150);
    }
}
