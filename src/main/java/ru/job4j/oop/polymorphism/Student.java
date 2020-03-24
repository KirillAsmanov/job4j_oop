package ru.job4j.oop.polymorphism;
/**
 * Класс студента
 * 3.1. Приведение типов. Повышение типа и понижение типа.[#245056]
 * @author Kirill Asmanov
 * @since 24.03.2020
 */
public class Student {
    /**
     * Содержит имя
     */
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
