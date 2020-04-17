package ru.job4j.oop.collections.sort;

import java.util.*;

/**
 * Отсортировать департаменты[#244992]
 * @author Kirill Asmanov
 * @since 17.04.2020
 * @version 1.0.0;
 */
public class Departments {
    /**
     * Добавляет отсутствующие департаменты в список
     * @param deps - исходный список
     * @return - список с заполенными пропущенными элементами
     */
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            String[] str = value.split("/");
            for (int index = 0; index < str.length; index++) {
                start += (index == 0) ? str[0] : "/" + str[index];
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
