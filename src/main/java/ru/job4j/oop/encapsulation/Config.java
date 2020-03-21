package ru.job4j.oop.encapsulation;
/**
 * Класс, в котором необходимо было исправить нарушения инкапсуляции
 * Упр. 0. Что такое инкапсуляция.[#245108]
 * @author Kirill Asmanov
 * @since 21.03.2020
 * @version 1.0.0;
 */

public class Config {
    private String name; // 1 - отсутствовал модификатор private
    private int position; // 2 - вместо модификатора protected должен быть использован private
    private String[] properties; // 3 - вместо модификатора public должен быть использован private

    public Config(String name) {
        this.name = name;
    }

    public void print() {  // 4 - отсутствовал модификатор доступа, был добавлен public
        System.out.println(position);
    }

    public String getProperty(String key) { // 5 - вместо модификатора protected должен быть использован public
        return search(key);
    }

    private String search(String key) {
        return key;
    }
}
