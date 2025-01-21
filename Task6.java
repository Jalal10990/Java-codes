import java.util.*;

class Student {
    int rollNumber;
    String name;
    int marks;

    // Constructor
    public Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
}

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        int rollNumber;
        String name;
        int marks;

        // Corrected message with single-line formatting
        System.out.println("Enter student details (Roll Number, Name, Marks). Enter 0 as Roll Number to stop.");

        // Input Loop
        while (true) {
            System.out.print("Enter Roll Number: ");
            rollNumber = scanner.nextInt();

            // Exit condition
            if (rollNumber == 0) {
                break;
            }

            scanner.nextLine();  // Consume the newline character

            System.out.print("Enter Name: ");
            name = scanner.nextLine();

            System.out.print("Enter Marks: ");
            marks = scanner.nextInt();

            // Add student details to the list
            students.add(new Student(rollNumber, name, marks));
        }

        // Sort the students list in descending order of marks
        Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);

        // Display the sorted data
        System.out.println("\nStudents sorted in descending order of marks:");
        for (Student student : students) {
            System.out.println("Roll Number: " + student.rollNumber + ", Name: " + student.name + ", Marks: " + student.marks);
        }

        scanner.close();  // Close the scanner
    }
}
