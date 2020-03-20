package ru.job4j.oop.profession;
/**
 * Дочерний класс для строителя. Унаследован от класса Doctor
 * Упр. 3. Реализация профессий в коде[#245099]
 * @author Kirill Asmanov
 * @since 20.03.2020
 * @version 1.0.0;
 */
public class Dentist extends Doctor {
    private boolean hasAnostesia;
    /**
     * Конструктор для экземпляра программиста
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param pacient - пациент
     * @param hasAnostesia - наличие аностезии
     */
    public Dentist(String name, String surname, String education, String birthday, Pacient pacient, boolean hasAnostesia) {
        super(name, surname, education, birthday, pacient);
        this.hasAnostesia = hasAnostesia;
    }

    /**
     * Провести лечение зуба
     * @param pacient - пациент
     */
    public void doHealTooth(Pacient pacient) {

    }
}
