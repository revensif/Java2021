package com.company;

import java.util.*;

public class StudentGroup {
    private final Map<String, Student> students;
    private final Set<String> subjects;
    private final int number;

    public StudentGroup(int number) {
        this.number = number;
        students = new HashMap<String, Student>();
        subjects = new HashSet<String>();
    }

    public boolean addStudent(String fullName) {
        if (students.containsKey(fullName)) return false;
        students.put(fullName, new Student(fullName, subjects));
        return true;
    }

    public boolean deleteStudent(String fullName) {
        if (!students.containsKey(fullName)) return false;
        students.remove(fullName);
        return true;
    }

    public boolean addSubject(String subject) {
        if (!subjects.add(subject)) return false;
        for (Student student : students.values()) {
            student.putMark(subject,"");
        }
        return true;
    }

    public boolean deleteSubject(String subject) {
        if (!subjects.remove(subject)) return false;
        for (Student student : students.values()
        ) {
            deleteMark(student.getFullName(), subject);
        }
        return true;
    }

    public boolean changeMark(String mark, String fullName, String subject) {
        if (!students.get(fullName).getMarks().containsKey(subject))
            return false;
        students.get(fullName).putMark(subject, mark);
        return true;
    }

    public boolean deleteMark(String fullName, String subject) {
        if (!students.get(fullName).getMarks().containsKey(subject))
            return false;
        changeMark("", fullName, subject);
        return true;
    }

    public String showMark(String fullName, String subject) {
        if (!students.get(fullName).getMarks().containsKey(subject))
            return null;
        return students.get(fullName).getMarks().get(subject);
    }
}