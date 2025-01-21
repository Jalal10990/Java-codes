import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rollNumber;
        String name;
        int marks;

        int maxMarks = Integer.MIN_VALUE;  // To track the maximum marks
        String topStudentName = "";
        int topStudentRollNumber = -1;

        // Corrected message with single-line formatting
        System.out.println("Enter student details (Roll Number, Name, Marks). Enter 0 as Roll Number to stop.");

        // Start taking input until rollNumber is 0
        while (true) {
            System.out.print("Enter Roll Number: ");
            rollNumber = scanner.nextInt();

            // Exit condition
            if (rollNumber == 0) {
                break;
            }

            scanner.nextLine();  // Consume the newline character left after reading an integer

            System.out.print("Enter Name: ");
            name = scanner.nextLine();

            System.out.print("Enter Marks: ");
            marks = scanner.nextInt();

            // Update the top student information if current marks are greater
            if (marks > maxMarks) {
                maxMarks = marks;
                topStudentName = name;
                topStudentRollNumber = rollNumber;
            }
        }

        // Check if we have any valid input
        if (maxMarks == Integer.MIN_VALUE) {
            System.out.println("No student records entered.");
        } else {
            System.out.println("\nStudent with the highest marks:");
            System.out.println("Roll Number: " + topStudentRollNumber);
            System.out.println("Name: " + topStudentName);
            System.out.println("Marks: " + maxMarks);
        }

        scanner.close();  // Close the scanner
    }
}
