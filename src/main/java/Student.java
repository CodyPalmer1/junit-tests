import java.util.ArrayList;

public class Student {
    private long Id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long inputId, String inputName) {
        this.Id = inputId;
        this.name = inputName;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int inputGrade) {
        this.grades.add(inputGrade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for(int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
