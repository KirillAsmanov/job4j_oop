package ru.job4j.oop.polymorphism;
/**
 * Класс колледжа
 * 3.1. Приведение типов. Повышение типа и понижение типа.[#245056]
 * @author Kirill Asmanov
 * @since 24.03.2020
 */
public class College {
    public static void main(String[] args) {
        /**
         * upcast присваиванием
         */
        Freshman newbee = new Freshman("Таня");
        Student newbeeUpcast = newbee;
        Object oNewbee = newbeeUpcast;

        /**
         * upcast при создании
         */
        Student secondNewbee = new Freshman("Иван");
    }
}
