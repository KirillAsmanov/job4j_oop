package ru.job4j.oop;
/**
 * Класс, описывающий поведение батареи. Упр. 1.7. Состояние объекта.[#245089]
 * @author Kirill Asmanov
 * @since 15.03.2020
 * @version 1.0.0;
 */
public class Battery {
    private int load;

    /**
     * Сеттер на заряд
     * @param load - параметр заряда батарие
     */
    public Battery(int load) {
        this.load = load;
    }

    /**
     * Производит передачу заряда от одной батареи другой.
     * @param another - батарея, которой будет производиться передача заряда
     */
    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(25);
        Battery second = new Battery(13);
        System.out.println("Charge of first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("Charge of first : " + first.load + ". second : " + second.load);
    }
}
