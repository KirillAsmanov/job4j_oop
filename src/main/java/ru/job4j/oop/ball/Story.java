package ru.job4j.oop.ball;
/**
 * Класс, рассказывающий сказку. Упр. 1.6. Взаимодействие объектов.[#245087]
 * @author Kirill Asmanov
 * @since 15.03.2020
 * @version 1.0.0;
 */
public class Story {
    /**
     * Точка входа
     * @param args - arg
     */
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Fox lisa = new Fox("Лиса");
        Wolf volk = new Wolf("Серый волк");
        Hare zayac = new Hare("Зайчик-Побегайчик");

        System.out.println("Шел колобок по лесу, тут навстречу ему заяц.");
        zayac.tryEat(kolobok);
        System.out.println("Идет дальше, видит - волк.");
        volk.tryEat(kolobok);
        System.out.println("Вышел на лужайку, а там сидит лисичка-сестричка.");
        lisa.tryEat(kolobok);
        System.out.println("Вот и сказке конец, а кто слушал - молодец");
    }


}
