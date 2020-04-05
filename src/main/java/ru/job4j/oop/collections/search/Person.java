package ru.job4j.oop.collections.search;
/**
 * 1. Телефонный справочник на базе ArrayList[#245001]
 * @author Kirill Asmanov
 * @since 05.04.2020
 * @version 1.0.0;
 */
public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
