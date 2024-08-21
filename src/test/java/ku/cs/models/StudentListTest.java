package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList students;

    @BeforeEach
    void init() {
        students = new StudentList();
    }

    @Test
    void testAddNewStudent() {
        students.addNewStudent("1", "a");
        students.addNewStudent("2", "b");
        students.addNewStudent("3", "c");

        assertEquals(3, students.getStudents().size());
    }

    @Test
    @DisplayName("score")
    void testAddNewStudentAndScore() {
        students.addNewStudent("1", "a", 0);
        students.addNewStudent("2", "b", 0);
        students.addNewStudent("3", "c", 0);

        assertEquals(3, students.getStudents().size());
    }

    @Test
    void testFindStudentById() {
        students.addNewStudent("1", "a");
        students.addNewStudent("2", "b");
        students.addNewStudent("3", "c");

        Student s1 = students.findStudentById("2");
        assertEquals("2", s1.getId());
    }

    @Test
    void testGiveScoreToId() {
        students.addNewStudent("1", "a", 0);
        students.addNewStudent("2", "b", 0);
        students.addNewStudent("3", "c", 0);

        students.giveScoreToId("2", 10.0);
        Student s1 = students.findStudentById("2");
        assertEquals(10.0, s1.getScore());
    }

    @Test
    void testViewGradeOfId() {
        students.addNewStudent("1", "a", 0);
        students.addNewStudent("2", "b", 80);
        students.addNewStudent("3", "c", 0);

        String s1 = students.viewGradeOfId("2");
        assertEquals("A", s1);
    }
}