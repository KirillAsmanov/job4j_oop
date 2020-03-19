package ru.job4j.oop;
/**
 * Упр. 2.1. Рефакторинг - Расстояние между точками.[#245079]
 * @author Kirill Asmanov
 * @since 15.03.2020
 * @version 1.0.0;
 */
public class Point {
    private int x;
    private int y;

    /**
     * Конструктор
     * @param x - x
     * @param y - y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Находит расстояние между точкой, у которой вызван этот метод, и точкой, входящей в этот метод
     * @param point - входящая точка
     * @return - расстояние между точками
     */
    public double distance(Point point) {
        double rsl = Math.sqrt((Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2)));
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
