import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class student {
  int id;
  String name;
  String Division;


  public student(int id, String name, String Division) {
    this.id = id;
    this.name = name;
    this.Division = Division;

  }

  public void display() {
    System.out.println("Id: " + id + "Name: " + name + "Division: " + Division);

  }
}

  public class main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<student> students = new ArrayList<>();

      System.out.println("Enter the number of students: ");
      int noofstudents = sc.nextInt();

      for (int i = 0; i < noofstudents; i++) {
        System.out.println("Enter the student details of" + (i + 1) + ": ");

        System.out.print("Id: ");
        int id = sc.nextInt();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Division: ");
        String Division = sc.nextLine();

        students.add(new student(id, name, Division));
      

      }
        Collections.sort(students, new Comparator<Student>() {
          @Override
          public int compare(Student s1, Student s2) {
              return Integer.compare(s1.id, s2.id);
          }
        });

        // Display sorted student details
        System.out.println("\nStudents sorted by ID:");
        for (Student student : students) {
          student.display();
        }
      Scanner.close()

    
    
    }
}