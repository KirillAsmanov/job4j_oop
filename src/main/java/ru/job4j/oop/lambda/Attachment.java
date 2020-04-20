package ru.job4j.oop.lambda;
/**
 * 1. Анонимные классы[#244869]
 * @author Kirill Asmanov
 * @since 20.04.2020
 * @version 1.0.0;
 */
public class Attachment {
    private String name;
    private int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "name='" + "{" + name + '\'' + ", size=" + size + '}';
    }
}
