import java.util.Scanner;

public class labTask2 {
    public static void main(String[] args) {
        Scanner jalal = new Scanner(System.in); 


        System.out.print("Enter an ASCII code (0-127): ");
        int asciiCode = jalal.nextInt();

        if (asciiCode >= 0 && asciiCode <= 127) {
            char character = (char) asciiCode;
            System.out.println("The character for ASCII code " + asciiCode + " is: " + character);
        } else {
            System.out.println("Invalid ASCII code. Please enter a number between 0 and 127."); 

        }







    }
}
