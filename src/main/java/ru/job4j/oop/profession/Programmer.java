package ru.job4j.oop.profession;
/**
 * Дочерний класс для программиста. Унаследован от класса Engineer
 * Упр. 3. Реализация профессий в коде[#245099]
 * @author Kirill Asmanov
 * @since 20.03.2020
 * @version 1.0.0;
 */
public class Programmer extends Engineer {
    String language;

    /**
     * Конструктор для экземпляра программиста
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param project - проект
     * @param language - язык программирования
     */
    public Programmer(String name, String surname, String education, String birthday, Project project, String language) {
        super(name, surname, education, birthday, project);
        this.language = language;
    }

    /**
     * Изучает новый язык программирования Java
     */
    public void learnJava() {
        this.language = this.language + ", JAVA";
    }
}
