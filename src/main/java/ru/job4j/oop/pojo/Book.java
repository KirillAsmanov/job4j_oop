package ru.job4j.oop.pojo;
/**
 * Класс для описания модели книги
 * 3. Массивы и модели.[#245102]
 * @author Kirill Asmanov
 * @since 21.03.2020
 */
public class Book {
    /**
     * Содержит название книги
     */
    private String name;
    /**
     * Содержит количество страниц книги
     */
    private int countOfPages;

    public String getName() {
        return name;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public Book(String name, int countOfPages) {
        this.name = name;
        this.countOfPages = countOfPages;
    }
}
