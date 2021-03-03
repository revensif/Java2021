package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private final String fullName;
    private final HashMap<String, Integer> marks;

    public Student(String fullName, HashMap<String, Integer> marks) {
        this.fullName = fullName;
        this.marks = marks;
    }

    public Student(String fullName, ArrayList<String> subjects) {
        this.fullName = fullName;
        marks = new HashMap<>();
        for (String subject : subjects) {
            marks.put(subject, 0);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void putMark(String subject, int mark) {
        marks.put(subject, mark);
    }

    public void removeMark(String subject) {
        marks.remove(subject);
    }

    public HashMap<String, Integer> getMarks() {
        return marks;
    }
}
