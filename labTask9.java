
import java.util.Scanner;
public class labTask9 {
    public static void main(String[] args) {
         Scanner jalal = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = jalal.nextLine();

        int firstHIndex = inputString.indexOf('h');
        int lastHIndex = inputString.lastIndexOf('h');

        StringBuilder modifiedString = new StringBuilder(inputString);

        for (int i = firstHIndex + 1; i < lastHIndex; i++) {
            if (modifiedString.charAt(i) == 'h') {
                modifiedString.setCharAt(i, 'H');
            }
        }

        System.out.println("Modified string: " + modifiedString.toString());
    
    }
}