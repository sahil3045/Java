import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Class to store Student details
class Student {
    int id;
    String name;
    String studentClass;

    // Constructor
    public Student(int id, String name, String studentClass) {
        this.id = id;
        this.name = name;
        this.studentClass = studentClass;
    }

    // Method to display student details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Class: " + studentClass);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Input student details
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume newline left by nextInt()

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Class: ");
            String studentClass = scanner.nextLine();

            // Add student to the list
            students.add(new Student(id, name, studentClass));
        }

        

        scanner.close();
    }
}
