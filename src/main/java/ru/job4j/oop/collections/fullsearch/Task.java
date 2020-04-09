package ru.job4j.oop.collections.fullsearch;
/**
 * 1. Уникальные задачи.[#245014]
 * @author Kirill Asmanov
 * @since 09.04.2020
 * @version 1.0.0;
 */
public class Task {
    /**
     * Содержит неуникальный номер задачи
     */
    private String number;
    /**
     * Содержит описание задачи
     */
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
