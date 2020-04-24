package ru.job4j.oop.lambda.tours;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * 2. Список адресов [#244874]
 * @author Kirill Asmanov
 * @since 23.04.2020
 * @version 1.0.0;
 */
public class TravelAgency {
    /**
     * Извлекает из списка профилей адреса клиентов и добавляет их в новый список
     * @param profiles - список профилей
     * @return список с адресами
     */
    public static List<Profile.Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    /**
     * Извлекает из списка профилей адреса клиентов и добавляет их в новый список, удаляя дубликаты и сортируя по городам
     * @param profiles - список профилей
     * @return список с адресами
     */
    public static List<Profile.Address> uniqueSort(List<Profile> profiles) {
        return  collect(profiles).stream()
                .sorted(Comparator.comparing(Profile.Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
