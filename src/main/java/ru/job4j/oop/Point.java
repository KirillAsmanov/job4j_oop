package ru.job4j.oop;
/**
 * Упр. 2.1. Рефакторинг - Расстояние между точками.[#245079]
 * Упр. 4. Расстояние между точками в трехмерном пространстве.[#245081]
 * @author Kirill Asmanov
 * @since 19.03.2020
 * @version 1.0.0;
 */
public class Point {
    private int x;
    private int y;
    private int z;

    /**
     * Конструктор для двумерного пространства
     * @param x - x
     * @param y - y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Находит расстояние в двумерном пространстве между точкой, у которой вызван этот метод, и точкой, входящей в этот метод
     * @param point - входящая точка
     * @return - расстояние между точками
     */
    public double distance(Point point) {
        double rsl = Math.sqrt((Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2)));
        return rsl;
    }

    /**
     * Находит расстояние в троехмерном пространстве между точкой, у которой вызван этот метод, и точкой, входящей в этот метод
     * @param point - входная точка
     * @return - расстояние в трехмерном пространстве
     */
    public double distance3d(Point point) {
        return Math.sqrt((Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2)) + Math.pow((this.z - point.z), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 0, 12);
        Point d = new Point(10, 12, 0);
        double dist = a.distance(b);
        double distThirdDim = c.distance3d(d);
        System.out.println(dist);
        System.out.println(distThirdDim);
    }
}
