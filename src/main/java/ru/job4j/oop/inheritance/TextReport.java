package ru.job4j.oop.inheritance;
/**
 * Класс текстового отчета
 * 4. Переопределение[#245096]
 * 5. Аннотация @Override[#245097]
 * @author Kirill Asmanov
 * @since 20.03.2020
 */
public class TextReport {
    /**
     * Генерирует отчет
     * @param name - название отчета
     * @param body - тело отчета
     * @return - возвращает готовый отчет
     */
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
