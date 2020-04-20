package ru.job4j.oop.lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
/**
 * 5. Подсчет функции в диапазоне.[#244864]
 * @author Kirill Asmanov
 * @since 20.04.2020
 * @version 1.0.0;
 */
public class DiapasonFunction {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (int i = start; i < end; i++) {
            rsl.add(func.apply((double) i));
        }
        return rsl;
    }
}
