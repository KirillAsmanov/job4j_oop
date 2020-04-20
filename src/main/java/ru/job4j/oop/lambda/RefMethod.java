package ru.job4j.oop.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/**
 * 3. Ссылки на методы.[#244867]
 * @author Kirill Asmanov
 * @since 20.04.2020
 * @version 1.0.0;
 */
public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );
        Consumer<String> out = RefMethod::cutOut;
        names.forEach(out);
    }

    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        } else {
            System.out.println(value);
        }
    }
}
