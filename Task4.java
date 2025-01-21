import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int index = -1;

        System.out.println("Enter 10 integer values:");

        for (int i = 0; i < 10; i++) {
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Enter value for index [" + i + "]: ");
                    array[i] = Integer.parseInt(scanner.nextLine());
                    validInput = true; // Input is valid
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer value.");
                }
            }
        }

        boolean validIndex = false;

        while (!validIndex) {
            try {
                System.out.print("Enter an index (0-9) to display the value: ");
                index = Integer.parseInt(scanner.nextLine());
                System.out.println("The value at index " + index + " is: " + array[index]);
                validIndex = true; // Valid index provided
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer index.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index. Index must be between 0 and 9. Try again.");
            }
        }
    }
}