package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentGroupTest {

    @org.junit.jupiter.api.Test
    void changeMark() {
        StudentGroup g1 = new StudentGroup(1);
        g1.addStudent("Студент1");
        g1.addSubject("Предмет1");
        g1.changeMark("4", "Студент1", "Предмет1");
        System.out.println(g1.showMark("Студент1", "Предмет1"));
        assertEquals("4",g1.showMark("Студент1", "Предмет1"));
    }

    @org.junit.jupiter.api.Test
    void deleteMark() {
        StudentGroup g1 = new StudentGroup(1);
        g1.addStudent("Студент1");
        g1.addSubject("Предмет1");
        g1.changeMark("4", "Студент1", "Предмет1");
        g1.deleteMark("Студент1","Предмет1");
        System.out.println(g1.showMark("Студент1", "Предмет1"));
        assertEquals("",g1.showMark("Студент1", "Предмет1"));
    }
}