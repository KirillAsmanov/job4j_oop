package ru.job4j.oop.polymorphism;
/**
 * Интерфуйс транспорта
 * 3. Интерфейс Input[#245053]
 * @author Kirill Asmanov
 * @since 24.03.2020
 */
public interface Transport {
     void move();
     void passengers(int count);
     int fillUp(int fuel);
}
