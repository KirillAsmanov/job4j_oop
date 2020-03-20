package ru.job4j.oop.profession;
/**
 * Родительский класс для профессий технических специальностей. Унаследован от класса Profession
 * Упр. 3. Реализация профессий в коде[#245099]
 * @author Kirill Asmanov
 * @since 20.03.2020
 * @version 1.0.0;
 */
public class Engineer extends Profession {
    Project project;

    /**
     * Конструктор для экземпляра технической профессии
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param project - проект
     */
    public Engineer(String name, String surname, String education, String birthday, Project project) {
        super(name, surname, education, birthday);
        this.project = project;
    }

    /**
     * Выполняет работу над проектом
     */
    public void doProject() {

    }
}
