package ru.job4j.oop.collections.search;

import java.util.ArrayList;
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
        // Скорее всего я не понял суть задания, ибо сложность и громоздкость условия не сильно изменилась
        Predicate<String> checkContain = s -> s.contains(key);
        Predicate<Person> combine = (p) -> checkContain.test(p.getName()) || checkContain.test(p.getSurname()) || checkContain.test(p.getAddress()) || checkContain.test(p.getPhone());
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
