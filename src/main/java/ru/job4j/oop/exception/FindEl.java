package ru.job4j.oop.exception;

import java.util.Arrays;
/**
 * Упр. 0.4. Пользовательские исключения.[#245072]
 * @author Kirill Asmanov
 * @since 27.03.2020
 * @version 1.0.0;
 */
public class FindEl {
    /**
     * Находит индекс элемента с заданным значением в массиве
     * @param value - строковый массив, в котором производится поиск
     * @param key - искомое значение
     * @return - индекс элемента, либо -1, если совпадения нет
     * @throws ElementNotFoundException - падает, если значение key не задано
     */
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        if (key == null) {
            throw new ElementNotFoundException("Key's value couldn't be null");
        }
        int rsl = -1;
        for (String element:value) {
            if (key.equals(element)) {
                rsl = Arrays.asList(value).indexOf(key);
            } else {
                throw new ElementNotFoundException("Cannot find element with this key");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] items = new String[] {"one", "two", "three"};
        try {
            System.out.println(indexOf(items, "four"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
