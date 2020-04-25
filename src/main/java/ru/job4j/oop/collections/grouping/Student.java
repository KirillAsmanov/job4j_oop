package ru.job4j.oop.collections.grouping;

import java.util.Set;
/**
 * Группировка по интересам. [#106993]
 * Модель данных для ученика
 * @author Kirill Asmanov
 * @since 26.04.2020
 * @version 1.0.0;
 */
public class Student {
    private String name;
    private Set<String> units;

    public Student(String name, Set<String> units) {
        this.name = name;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public Set<String> getUnits() {
        return units;
    }
}
