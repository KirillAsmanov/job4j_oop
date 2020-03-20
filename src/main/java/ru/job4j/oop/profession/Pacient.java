package ru.job4j.oop.profession;
/**
 * Класс для пациентов
 * Упр. 3. Реализация профессий в коде[#245099]
 * @author Kirill Asmanov
 * @since 20.03.2020
 * @version 1.0.0;
 */
public class Pacient {
    private String name;
    private Diagnose diagnose;

    /**
     * Конструктор для пациента
     * @param name - имя
     * @param diagnose - диагноз пациента
     */
    public Pacient(String name, Diagnose diagnose) {
        this.name = name;
        this.diagnose = diagnose;
    }

    /**
     * Геттер для диагноза
     * @return диагноз
     */
    public Diagnose getDiagnose() {
        return diagnose;
    }

    /**
     * Метод для вывода информации о пациенте
     * @return - строка с информацией
     */
    @Override
    public String toString() {
        return "Имя пациента: " + name + ". Диагноз: " + diagnose.getName();
    }
}
