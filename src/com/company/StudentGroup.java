package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentGroup {
    private final HashMap<String, Student> students;
    private final ArrayList<String> subjects;
    private final int number;

    public StudentGroup(int number, HashMap<String, Student> students, ArrayList<String> subjects) {
        this.number = number;
        this.students = students;
        this.subjects = subjects;
    }

    public void addStudent(String fullName) {
        students.put(fullName, new Student(fullName, subjects));
    }

    public void deleteStudent(String fullName) {
        students.remove(fullName);
    }

    public void addSubject(String subject) {
        subjects.add(subject);
        for (Student student : students.values()) {
            changeMark(0, student.getFullName(), subject);
        }
    }

    public void deleteSubject(String subject) {
        try {
            subjects.remove(subjects.indexOf(subject));
            for (Student student : students.values()
            ) {
                deleteMark(student.getFullName(), subject);
            }
        } catch (Exception e) {
            System.out.println(subject + " нет");
        }

    }

    public void changeMark(int mark, String fullName, String subject) {
        students.get(fullName).putMark(subject, mark);
    }

    public void deleteMark(String fullName, String subject) {
        students.get(fullName).removeMark(subject);
    }

    public void showMark(String fullName, String subject) {
        System.out.println(students.get(fullName).getMarks().get(subject));
    }
}