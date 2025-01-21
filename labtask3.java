import java.util.Scanner;

public class labtask3 {
    public static void main(String[] args) {
        Scanner jalal = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = jalal.next().charAt(0); 

        int unicode = (int) character;
        System.out.println("The Unicode of '" + character + "' is: " + unicode);
    }
}
