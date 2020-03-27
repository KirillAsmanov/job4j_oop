package ru.job4j.oop.exception;

public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String el = shops[index];
            // Добавил short-circuit условие проверки на null, чтобы вторая часть не
            // выполнялась, если первая не является true
            if ((el != null) && (el.length() > max)) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}
