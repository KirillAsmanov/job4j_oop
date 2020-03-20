package ru.job4j.oop.inheritance;
/**
 * Класс отчета в JSON-формате
 * 5. Аннотация @Override[#245097]
 * 4. Переопределение[#245096]
 * @author Kirill Asmanov
 * @since 20.03.2020
 */
public class JSONReport extends TextReport {

    /**
     * Переопределенный метод для создания JSON-отчета
     * @param name - название отчета
     * @param body - тело отчета
     * @return - отчет в JSON-формате
     */
    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + "   name : " + name + System.lineSeparator() + "   body : " + body + System.lineSeparator() + "}";
    }
}
