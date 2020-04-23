package ru.job4j.oop.lambda.tours;

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
        Function<Profile, Profile.Address> extractAddress = Profile::getAddress;
        return profiles.stream().map(extractAddress).collect(Collectors.toList());
    }
}
