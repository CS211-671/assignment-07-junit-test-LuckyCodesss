package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testAddScore() {
        Student s1 = new Student("66104xxxxx", "FIFA");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }

    @Test
    @DisplayName("ทดสอบการคิดเกรด")
    void testCalculateGrade() {
        Student s1 = new Student("66104xxxxx", "FIFA");
        s1.addScore(60.8);
        assertEquals("B", s1.grade());
    }

    @Test
    void testChangeName() {
        Student s1 = new Student("66104xxxxx", "FIFA");
        s1.changeName("FIFO");
        assertEquals("FIFO", s1.getName());
    }

    @Test
    void testIsId() {
        Student s1 = new Student("66104xxxxx", "FIFA");
        assertTrue(s1.isId("66104xxxxx"));
    }
}