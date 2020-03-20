package ru.job4j.oop.profession;
/**
 * Родительский класс для профессий докторов. Унаследован от класса Profession
 * Упр. 3. Реализация профессий в коде[#245099]
 * @author Kirill Asmanov
 * @since 20.03.2020
 * @version 1.0.0;
 */
public class Doctor extends Profession {
    Pacient pacient;

    /**
     * Конструктор для экземпляра докторов
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param pacient - пациент
     */
    public Doctor(String name, String surname, String education, String birthday, Pacient pacient) {
        super(name, surname, education, birthday);
        this.pacient = pacient;
    }

    /**
     * Выводит информацию об экземпляре
     * @return
     */
    @Override
    public String toString() {
        return "ФИО: " + getName() + " " + getSurname() + ". Образование: " + getEducation() + ". Дата рождения: " + getBirthday();
    }

    /**
     * Выполняет процедуру постановки диагноза
     * @param pacient - пациент
     * @return - диагноз пациента
     */
    public Diagnose heal(Pacient pacient) {
        return pacient.getDiagnose();
    }
}