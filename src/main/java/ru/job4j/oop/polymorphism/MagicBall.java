package ru.job4j.oop.polymorphism;

import java.util.Random;
import java.util.Scanner;
/**
 * Класс предсказателя
 * 1. Чтение из консоли. Класс Scanner.[#245051]
 * @author Kirill Asmanov
 * @since 23.03.2020
 */
public class MagicBall {
    /**
     * Метод выполняет предсказание на основе случайного числа
     * @return - строка, ответ на заданный вопрос
     */
    public String prediction() {
        int answer = new Random().nextInt(3);
        String replie;
        if (answer == 0) {
            replie = "Нет";
        } else if (answer == 1) {
            replie = "Да.";
        } else {
            replie = "Может быть...";
        }
        return replie;
    }

    public static void main(String[] args) {
        MagicBall oracle = new MagicBall();
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        System.out.println(question + " - хороший вопрос! Надо подумать...");
        String output = oracle.prediction();
        System.out.println(output);
    }
}
