package ru.job4j.oop.pojo;
/**
 * Класс колледжа
 * 2. Модель данных.[#245101]
 * @author Kirill Asmanov
 * @since 21.03.2020
 */
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Асманов Кирилл Алексеевич");
        student.setGroup("K3120");
        student.setDateOfAdmission("01.09.2015");
        System.out.println("ФИО: " + student.getName() + ". Группа: " + student.getGroup() + ". Дата поступления: " + student.getDateOfAdmission());
    }
}
