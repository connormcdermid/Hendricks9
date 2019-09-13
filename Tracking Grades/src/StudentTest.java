import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void inputGrades() {
        Student john = new Student("John");
        john.inputGrades();
        assertEquals(john.getAverage(), 71.5);
    }

    @Test
    void printAverage() {
    }

    @Test
    void getAverage() {
    }

    @Test
    void toInt() {
    }

    @Test
    void toLetter() {
    }

    @Test
    void testToString() {
    }
}