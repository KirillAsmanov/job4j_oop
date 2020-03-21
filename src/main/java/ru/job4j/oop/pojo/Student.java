package ru.job4j.oop.pojo;
/**
 * Класс студента с аксессорами
 * 2. Модель данных.[#245101]
 * @author Kirill Asmanov
 * @since 21.03.2020
 */
public class Student {
    private String name;
    private String group;
    private String dateOfAdmission;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}
