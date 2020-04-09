package ru.job4j.oop.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * 2. Идентичные тексты.[#245015]
 * @author Kirill Asmanov
 * @since 09.04.2020
 * @version 1.0.0;
 */
public class UniqueText {
    /**
     * Проверяет два текста на наличие повторяющихся слов независимо от порядка
     * @param originText - первый из сравниваемых текстов
     * @param duplicateText - второй
     * @return true, если тексты состоят из повторяющихся слов, false если различны
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        Set<String> check = new HashSet<>();
        for (String words : origin) {
            check.add(words);
        }
        for (String word : text) {
            if (!(check.contains(word))) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
