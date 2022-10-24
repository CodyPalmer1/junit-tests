import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CohortTest {
    Cohort cohort;

    @Before
    public void setUp() {
        cohort = new Cohort();
        Student cody = new Student(111111, "Cody");
        cody.addGrade(100);
        cody.addGrade(90);
        cohort.addStudent(cody);
        Student cas = new Student(222222, "Cas");
        cas.addGrade(80);
        cas.addGrade(70);
        cohort.addStudent(cas);
        Student jack = new Student(333333, "Jack");
        jack.addGrade(60);
        jack.addGrade(80);
        cohort.addStudent(jack);
    }

    @Test
    public void testGetCohortAverage() {
        assertEquals(80, cohort.getCohortAverage(), 0);
    }

    @Test
    public void testAddStudent() {
        cohort.addStudent(new Student(111111, "Cody"));
        assertEquals("Cody", cohort.getStudents().get(3).getName());
    }

}