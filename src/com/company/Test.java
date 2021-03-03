package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        HashMap<String, Student> students = new HashMap<>();
        subjects.add("Математика");
        subjects.add("Русский язык");
        subjects.add("Физика");
        students.put("Портнов Иван Максимович", new Student("Портнов Иван Максимович", subjects));
        students.put("Путин Владимир Владимирович", new Student("Путин Владимир Владимирович", subjects));
        students.put("Навальный Алексей Анатольевич", new Student("Навальный Алексей Анатольевич", subjects));
        StudentGroup group1 = new StudentGroup(1, students, subjects);
        group1.showMark("Путин Владимир Владимирович", "Русский язык");
        group1.changeMark(5, "Путин Владимир Владимирович", "Русский язык");
        group1.showMark("Путин Владимир Владимирович", "Русский язык");
        group1.addStudent("Портнов Егор Максимович");
        group1.changeMark(3,"Портнов Егор Максимович", "Физика");
        group1.showMark("Портнов Егор Максимович", "Физика");
        group1.deleteStudent("Портнов Иван Максимович");
        group1.deleteSubject("Физика");
        group1.showMark("Путин Владимир Владимирович", "Физика");
        group1.addSubject("Литература");
        group1.showMark("Путин Владимир Владимирович", "Литература");
    }
}
