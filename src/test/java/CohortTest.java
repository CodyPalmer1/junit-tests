import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CohortTest {
    Cohort cohort;

    @Before
    public void setUp() {
        cohort = new Cohort();
        Student jack = new Student(203040, "Jack");
        jack.addGrade(80);
        jack.addGrade(95);
        cohort.addStudent(jack);
        Student mark = new Student(153045, "Mark");
        mark.addGrade(70);
        mark.addGrade(80);
        cohort.addStudent(mark);
        Student billy = new Student(3432432, "Billy");
        billy.addGrade(60);
        billy.addGrade(80);
        cohort.addStudent(billy);
    }

    @Test
    public void testGetCohortAverage() {
        assertEquals(83.16, cohort.getCohortAverage(), 0);
    }

    @Test
    public void testAddStudent() {
        cohort.addStudent(new Student(203040, "Jack"));
        assertEquals("Jack", cohort.getStudents().get(3).getName());
    }

}
