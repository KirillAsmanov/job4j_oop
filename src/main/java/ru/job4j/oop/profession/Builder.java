package ru.job4j.oop.profession;
/**
 * Дочерний класс для строителя. Унаследован от класса Engineer
 * Упр. 3. Реализация профессий в коде[#245099]
 * @author Kirill Asmanov
 * @since 20.03.2020
 * @version 1.0.0;
 */
public class Builder extends Engineer {
    String buildAddress;
    Template template;
    /**
     * Конструктор для экземпляра программиста
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param project - проект
     * @param buildAddress - адрес стройки
     * @param template - чертеж для постройки
     */
    public Builder(String name, String surname, String education, String birthday, Project project, String buildAddress, Template template) {
        super(name, surname, education, birthday, project);
        this.buildAddress = buildAddress;
        this.template = template;
    }

    /**
     * Строить здание
     * @param template - чертеж для постройки
     */
    public void doBuild(Template template) {

    }
}
