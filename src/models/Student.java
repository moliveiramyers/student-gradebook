package src.models;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if ((grades.isEmpty())) {
            return 0;
        }
        double total = 0;

        for (double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
}
