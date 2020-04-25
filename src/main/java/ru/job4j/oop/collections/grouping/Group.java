package ru.job4j.oop.collections.grouping;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/**
 * Группировка по интересам. [#106993]
 * @author Kirill Asmanov
 * @since 26.04.2020
 * @version 1.0.0;
 */

public class Group {
    /**
     * Произволит группировку списка учеников по кружкам, в которых они состоят
     * @param students list учеников
     * @return Map, где key - название кружка, value - список имен, состоящих в нем
     */
    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(
                student -> student.getUnits().stream().map(unit -> new Holder(unit, student.getName()))
        ).collect(
                Collectors.groupingBy(holder -> holder.key, Collector.of(
                        HashSet::new,
                        (set, el) -> set.add(el.value),
                        (left, right) -> {
                            left.addAll(right);
                            return left;
                        })
                )
        );
    }

    /**
     * Служит для создания временного хранилища из модели Student;
     * key - название кружка, value - имя студента, состоящего в нем
     */
    static class Holder {
        String key, value;
        Holder(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}