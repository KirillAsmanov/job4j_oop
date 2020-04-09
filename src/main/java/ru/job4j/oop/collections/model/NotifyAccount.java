package ru.job4j.oop.collections.model;

import java.util.HashSet;
import java.util.List;
/**
 * 3. Модели данных и HashSet.[#245016]
 * @author Kirill Asmanov
 * @since 09.04.2020
 * @version 1.0.0;
 */
public class NotifyAccount {
    /**
     * Переносить элементы из List в HashSet для удаления дубликатов
     * @param accounts - список аккаунтов с возможными дубликатами
     * @return - HashSet только с уникальными значениями
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account : accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}