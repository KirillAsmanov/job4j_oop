package ru.job4j.oop.polymorphism;
/**
 * Класс автобуса
 * 3. Интерфейс Input[#245053]
 * @author Kirill Asmanov
 * @since 24.03.2020
 */
public class Bus implements Transport {
    private int passengers;

    @Override
    public void move() {
        System.out.println("Едем");
    }

    @Override
    public void passengers(int count) {
        passengers = count;
        System.out.println("В автобусе " + passengers + " пассажиров");
    }

    @Override
    public int fillUp(int fuel) {
        return fuel * 45;
    }
}
