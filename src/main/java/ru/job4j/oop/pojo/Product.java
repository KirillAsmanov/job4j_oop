package ru.job4j.oop.pojo;
/**
 * Модель товара
 * Упр. 3. Удаление моделей из массива.[#245104]
 * @author Kirill Asmanov
 * @since 22.03.2020
 * @version 1.0.0;
 */
public class Product {
    /**
     * Содержит название товара
     */
    private String name;
    /**
     * Содержит количество товара в магазине
     */
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
