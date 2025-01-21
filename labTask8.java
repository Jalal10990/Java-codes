import java.util.Scanner;
public class labTask8 {
    public static void main(String[] args) {
        Scanner jalal = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = jalal.nextLine();

        int firstIndex = inputString.indexOf('h');
        int lastIndex = inputString.lastIndexOf('h');

        if (firstIndex != -1 && lastIndex != -1 && firstIndex < lastIndex) {
            String newString = inputString.substring(0, firstIndex) + inputString.substring(lastIndex + 1);
            System.out.println("Modified string: " + newString);
        } else {
            System.out.println("The string does not contain 'h' at least twice.");
        }
    }
}
