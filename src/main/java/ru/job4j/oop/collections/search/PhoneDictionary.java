package ru.job4j.oop.collections.search;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * 1. Телефонный справочник на базе ArrayList[#245001]
 * @author Kirill Asmanov
 * @since 05.04.2020
 * @version 1.0.0;
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {

        Predicate<Person> checkName = p -> p.getName().contains(key);
        Predicate<Person> checkSurname = p -> p.getSurname().contains(key);
        Predicate<Person> checkPhone = p -> p.getPhone().contains(key);
        Predicate<Person> checkAddress = p -> p.getAddress().contains(key);

        Predicate<Person> combine = checkName.or(checkSurname.or(checkPhone.or(checkAddress)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
