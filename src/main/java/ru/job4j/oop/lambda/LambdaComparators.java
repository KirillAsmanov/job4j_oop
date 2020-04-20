package ru.job4j.oop.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 1. Анонимные классы[#244869]
 * @author Kirill Asmanov
 * @since 20.04.2020
 * @version 1.0.0;
 */
public class LambdaComparators {
    public static void main(String[] args) {
        /**
         * Создание компараторов при помощи лямбда-выражения:
         * 1. Создание обьекта анонимного класса от Comparator и установка обобщения входящих типов
         * 2. Описание входящих типов в скобках
         * 3. "->" - символ начала тела метода
         * 4. Тело метода без явной записи return, в случае, когда он единственный
         */
        Comparator<String> compNaturalOrder = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();

        List<String> strings = new ArrayList<String>();
        strings.add("AA");
        strings.add("BBBBB");
        strings.add("CCCC");
        strings.sort(compNaturalOrder);
        System.out.println(strings);
        strings.sort(cmpDescSize);
        System.out.println(strings);
    }
}
