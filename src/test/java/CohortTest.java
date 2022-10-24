import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohort;

    @Before
    public void setUp() {
        cohort = new Cohort();

        Student cody = new Student(101010, "Cody");
        cody.addGrade(99);
        cody.addGrade(95);
        cohort.addStudent(cody);

        Student jack = new Student(202020, "Jack");
        jack.addGrade(75);
        jack.addGrade(79);
        cohort.addStudent(jack);

        Student mark = new Student(404040, "Mark");
        mark.addGrade(85);
        mark.addGrade(95);
        cohort.addStudent(mark);
    }

    @Test
    public void testGetCohortAverage() {
        assertEquals(88, cohort.getCohortAverage(), 0);
    }

    @Test
    public void testAddStudent() {
        cohort.addStudent(new Student(151515, "Hamilton"));
        assertEquals("Hamilton", cohort.getStudents().get(3).getName());
    }

}
