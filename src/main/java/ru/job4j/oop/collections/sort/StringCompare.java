package ru.job4j.oop.collections.sort;

import java.util.Comparator;
/**
 * 3. Компаратор для строк[#244995]
 * @author Kirill Asmanov
 * @since 05.04.2020
 * @version 1.0.0;
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = Integer.compare(left.length(), right.length());
        int size = (rsl < 0) ? left.length() : right.length();
        for (int index = 0; index < size; index++) {
            int compChars = Character.compare(left.charAt(index), right.charAt(index));
            if (compChars > 0) {
                rsl = 1;
                break;
            } else if (compChars < 0) {
                rsl = -1;
                break;
            }
        }
        return rsl;
    }
}