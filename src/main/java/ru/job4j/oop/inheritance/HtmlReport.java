package ru.job4j.oop.inheritance;
/**
 * Класс отчета в Html-формате
 * 4. Переопределение[#245096]
 * @author Kirill Asmanov
 * @since 20.03.2020
 */
public class HtmlReport extends TextReport {

    /**
     * Генерирует отчет в Html-формате
     * @param name - название отчета
     * @param body - тело отчета
     * @return - отчет в html-формате
     */
    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + "<br/>" + "<span>" + body + "</span>";
    }
}
