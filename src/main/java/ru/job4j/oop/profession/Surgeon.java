package ru.job4j.oop.profession;
/**
 * Дочерний класс для хирурга. Унаследован от класса Doctor
 * Упр. 3. Реализация профессий в коде[#245099]
 * @author Kirill Asmanov
 * @since 20.03.2020
 * @version 1.0.0;
 */
public class Surgeon extends Doctor {
    private String dateOperation;
    /**
     * Конструктор для экземпляра программиста
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param pacient - пациент
     * @param dateOperation - дата операции
     */
    public Surgeon(String name, String surname, String education, String birthday, Pacient pacient, String dateOperation) {
        super(name, surname, education, birthday, pacient);
        this.dateOperation = dateOperation;
    }

    /**
     * Провести операцию
     * @param pacient - оперируемый пациент
     */
    public void doOperation(Pacient pacient) {

    }
}
