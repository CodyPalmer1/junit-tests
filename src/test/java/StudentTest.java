import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student student;

    @Before
    public void setUp() {
        student = new Student(101010, "Cody");
    }

    @Test
    public void testStudentHasParams() {
        assertNotNull(student.getId());
        assertNotNull(student.getName());
    }

    @Test
    public void testAddGrade() {
        student.addGrade(99);
        assertEquals(99, student.getGradeAverage(), 0.1);
        student.addGrade(80);
        student.addGrade(75);
        assertEquals(84.66, student.getGradeAverage(), 0.1);
    }

    @Test
    public void testGradesInitiallyEmpty() {
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void testSetters() {
        assertEquals("Cody", student.getName());
        assertEquals(101010, student.getId());
    }

}
