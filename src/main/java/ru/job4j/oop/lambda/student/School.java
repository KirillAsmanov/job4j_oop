package ru.job4j.oop.lambda.student;

import ru.job4j.oop.lambda.tours.Profile;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Фильтрация учеников. [#244873]
 * @author Kirill Asmanov
 * @since 23.04.2020
 * @version 1.0.0;
 */
public class School {
    /**
     * Реализует выборку из списка по переданному предикату и сортирует его
     * @param students - входящий список учеников
     * @param predict - условие разделения
     * @return - список, состоящий из учеников, подходящих под условие
     */
    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * Реализует преобразование списка в Map
     * @param students - входящий список учеников
     * @return - список, состоящий из учеников, подходящих под условие
     */
    public static Map<String, Student> collectToMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        s -> s
                ));
    }

    /**
     * Реализует выборку из списка по переданному предикату и сортирует его
     * @param students - входящий список учеников
     * @param bound - условие разделения
     * @return - список, состоящий из учеников, подходящих под условие
     */
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted(Comparator.comparing(Student::getScore))
                .dropWhile(s -> s.getScore() <= bound)
                .collect(Collectors.toList());
    }
}
