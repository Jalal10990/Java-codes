import java.util.Scanner;
public class labTask4 {
    public static void main(String[] args) {
        
        Scanner jalal = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 15: ");
        int decimalNumber = jalal.nextInt();

        if (decimalNumber >= 0 && decimalNumber <= 15) {
            String hexNumber = Integer.toHexString(decimalNumber);
            System.out.println("The hexadecimal equivalent is: " + hexNumber);
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 15.");
        }

    }
}
