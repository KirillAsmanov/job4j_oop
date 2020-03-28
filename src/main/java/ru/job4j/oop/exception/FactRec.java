package ru.job4j.oop.exception;

public class FactRec {
    public static int calc(int n) {
        int rsl = 1;
        if ((n != 0) && (n != 1)) {
            rsl = calc(n - 1) * n;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = calc(1);
        System.out.println(rsl);
    }
}
