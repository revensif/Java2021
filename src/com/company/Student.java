package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private final String fullName;
    private final Map<String, String> marks;

    public Student(String fullName, HashMap<String, String> marks) {
        this.fullName = fullName;
        this.marks = marks;
    }

    public Student(String fullName, Collection subjects) {
        this.fullName = fullName;
        marks = new HashMap<>();
        for (Object subject : subjects) {
            marks.put((String) subject, "");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void putMark(String subject, String mark) {
        marks.put(subject, mark);
    }

    public void removeMark(String subject) {
        marks.remove(subject);
    }

    public Map<String, String> getMarks() {
        return marks;
    }
}
