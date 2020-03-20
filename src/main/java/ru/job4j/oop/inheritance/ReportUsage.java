package ru.job4j.oop.inheritance;
/**
 * Класс генерирующий отчеты
 * 4. Переопределение[#245096]
 * 5. Аннотация @Override[#245097]
 * @author Kirill Asmanov
 * @since 20.03.2020
 */
public class ReportUsage {
    /**
     * точка входа
     * @param args - args
     */
    public static void main(String[] args) {
        TextReport textReport = new TextReport();
        JSONReport jsonReport = new JSONReport();
        HtmlReport htmlReport = new HtmlReport();
        System.out.println(textReport.generate("text report's name", "text report's body"));
        System.out.println("----------------------------------------------");
        System.out.println(jsonReport.generate("JSON report's name", "JSON report's body"));
        System.out.println("----------------------------------------------");
        System.out.println(htmlReport.generate("html report's name", "html report's body"));
    }
}
