package ru.job4j.oop.polymorphism;
/**
 * Класс новичка
 * 3.1. Приведение типов. Повышение типа и понижение типа.[#245056]
 * @author Kirill Asmanov
 * @since 24.03.2020
 */
public class Freshman extends Student {
    public Freshman(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
