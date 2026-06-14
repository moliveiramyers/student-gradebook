package src.services;

import java.util.ArrayList;
import src.models.Student;
// import src.utils.FileManager;

public class GradebookServices {
    private ArrayList<Student> students;

    public GradebookServices() {
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        Student student = new Student(name);
        students.add(student);
    }

    public void showStudents() {
        if (students.isEmpty()) {

            System.out.println("No students found.");

            return;
        }

        System.out.println("\nStudents:");

        for (Student student : students) {
            String status;
            if (student.calculateAverage() >= 10) {
                status = "Pass";

            } else {
                status = "Fail";
            }

            System.out.printf("- %s | Average: %.2f%n | %s%n",
                    student.getName(),
                    student.calculateAverage(),
                    status);
        }
    }

    public Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;

    }

    public void addGrade(String studentName, double grade) {
        Student student = findStudent(studentName);
        if (student != null) {
            student.addGrade(grade);
            System.out.println("Grade Added");
        } else {
            System.out.println("Student not found.");
        }
    }

    public String exportData() {
        StringBuilder data = new StringBuilder();
        for (Student student : students) {
            data.append(student.getName());
            for (Double grade : student.getGrades()) {
                data.append(";");
                data.append(grade);
            }
            data.append("\n");
        }

        return data.toString();
    }

    public void importData(String fileData) {
        String[] lines = fileData.split("\n");

        for (String line : lines) {
            if (line.isBlank()) {
                continue;
            }
            String[] parts = line.split(";");

            Student student = new Student(parts[0]);

            for (int i = 1; i < parts.length; i++) {
                student.addGrade(Double.parseDouble(parts[i]));
            }
            students.add(student);
        }
    }
}
