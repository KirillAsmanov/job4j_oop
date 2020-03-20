package ru.job4j.oop.profession;
/**
 * Родительский класс для всех профессий. Упр. 3. Реализация профессий в коде[#245099]
 * @author Kirill Asmanov
 * @since 20.03.2020
 * @version 1.0.0;
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    /**
     * Конструктор для экземпляра профессии
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     */
    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    /**
     * Геттеры для всех полей
     * @return - значение поля
     */
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEducation() {
        return education;
    }
    public String getBirthday() {
        return birthday;
    }
}
