package ru.job4j.oop.polymorphism;

import java.util.Scanner;
/**
 * Класс игры в спички
 * 2. Scanner и чтение числа из консоли.[#245052]
 * @author Kirill Asmanov
 * @since 23.03.2020
 */
public class Matches {
    /**
     * Определяет текущего игрока
     * @param turns - количество ходов
     * @return - возвращает строку, характеризующую текущего игрока
     */
    public String choosePlayer(int turns) {
        String player;
        if ((turns % 2) == 1) {
            player = "Игрок 1";
        } else {
            player = "Игрок 2";
        }
        return player;
    }

    public static void main(String[] args) {
        Matches game = new Matches();
        Scanner input = new Scanner(System.in);
        int count = 11;
        int turns = 0;
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек.");
        System.out.println("Выигрывает тот, кто забрал последние спички.");
        System.out.println(" ");
        while (count > 0) {
            turns++;
            System.out.println("----------" + "Ход " + turns + "----------");
            System.out.println(game.choosePlayer(turns) + " делает ход.");
            System.out.println("Выберите количество спичек: ");
            int matches = Integer.parseInt(input.nextLine());
            count = count - matches;
            System.out.println("Осталось спичек: " + count);
        }

        System.out.println(game.choosePlayer(turns) + " выигрывает!");

    }
}
