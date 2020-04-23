package ru.job4j.oop.lambda.student;

import java.util.Objects;

/**
 * 1. Фильтрация учеников. [#244873]
 * Модель данных ученика
 * @author Kirill Asmanov
 * @since 23.04.2020
 * @version 1.0.0;
 */
public class Student implements Comparable<Student> {
    private String surname;
    private int score;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String surname, int score) {
        this.surname = surname;
        this.score = score;
    }

    @Override
    public String toString() {
        return surname + score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, score);
    }

    @Override
    public int compareTo(Student o) {
        return this.surname.compareTo(o.surname);
    }
}
