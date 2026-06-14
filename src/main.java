package src;

import java.util.Scanner;
import src.services.GradebookServices;
import src.views.MenuView;
import src.utils.FileManager;

public class main {
    public static void main(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);

        GradebookServices service = new GradebookServices();
        service.importData(FileManager.Load());
        MenuView menu = new MenuView();

        int choice = -1;

        while (choice != 0) {

            System.out.println("===== Gradebook =====");

            // Add students
            menu.showMenu();

            // Get data from user
            choice = scanner.nextInt();
            System.out.println("You selected: " + choice);
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Student name:");
                String name = scanner.nextLine();
                service.addStudent(name);
                System.out.println(" Student added!");
            } else if (choice == 2) {
                service.showStudents();
            }

            else if (choice == 3) {
                System.out.print("Student name: ");

                String name = scanner.nextLine();

                System.out.print("Grade: ");

                double grade = scanner.nextDouble();
                scanner.nextLine();

                service.addGrade(name, grade);
            } else if (choice == 4) {
                FileManager.save(service.exportData());

            }

            else if (choice == 0) {
                System.out.println("Goodbye!");
            }

            else {

                System.out.println("Invalid option");

            }
        }

        scanner.close();
        // Services

    }

}
