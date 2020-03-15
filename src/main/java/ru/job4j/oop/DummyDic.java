package ru.job4j.oop;
/**
 * Упр. 1.4. Вызов метод с возвращаемым типом.[#245088]
 * @author Kirill Asmanov
 * @since 015.03.2020
 * @version 1.0.0;
 */
public class DummyDic {
    /**
     * Метод реализует работу бесполезного переводчика, который не знает слов
     * @param eng - входное слово
     * @return - строка, содержащая входное слово, к которому добавляется строка
     */
    public String engToRus(String eng) {
        String translate = "Неизвестное слово. " + eng;
        return translate;
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        System.out.println(translator.engToRus("Привет"));
    }
}
