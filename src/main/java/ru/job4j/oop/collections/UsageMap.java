package ru.job4j.oop.collections;

import java.util.HashMap;
/**
 * 0. Map, HashMap[#245009]
 * @author Kirill Asmanov
 * @since 09.04.2020
 * @version 1.0.0;
 */
public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> accounts = new HashMap<>();
        accounts.put("Asmanov@gmail.com", "Кирилл");
        accounts.put("Ivanov.I@gmail.com", "Иван");
        for (String mail : accounts.keySet()) {
            System.out.println("Mail: " + mail + ". Name: " + accounts.get(mail));
        }
    }
}
