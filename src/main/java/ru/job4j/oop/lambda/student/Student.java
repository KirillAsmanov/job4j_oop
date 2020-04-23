package ru.job4j.oop.lambda.student;
/**
 * 1. Фильтрация учеников. [#244873]
 * Модель данных ученика
 * @author Kirill Asmanov
 * @since 23.04.2020
 * @version 1.0.0;
 */
public class Student implements Comparable<Student> {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "score=" + "Student{" + score + '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.score, o.score);
    }
}
