package ru.job4j.oop;
/**
 * Упр. 2.2. Рефакторинг - Площадь треугольника.[#245080]
 * @author Kirill Asmanov
 * @since 19.03.2020
 * @version 1.0.0;
 */

public class TrgArea {
    private Point first;
    private Point second;
    private Point third;

    /**
     * Конструктор
     * @param first - первая вершина треугольника
     * @param second - вторая вершина треугольника
     * @param third - третья вершина треугольника
     */
    public TrgArea(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Вычисляет площадь существующего треугольника с заданными вершинами по формуле Герона
     * @return площадь этого трекгольника
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Вычисляет полупериметр
     * @param a - длина первой стороны
     * @param b - длина второй стороны
     * @param c - длина третьей стороны
     * @return - значение полупериметра
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Проверяет, существует ли треугольник с заданными координатами
     * @param a - длина первой стороны
     * @param b - длина второй стороны
     * @param c - длина третьей стороны
     * @return true если существует, false - если нет
     */
    public boolean exist(double a, double c, double b) {
        return (a + c > b) && (a + b > c) && (b + c > a);
    }
}

