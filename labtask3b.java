import java.util.Scanner;
public class labtask3b {
    public static void main(String[] args) {
        Scanner jalal=new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
               String hexDigit = jalal.next();     
       
               if (hexDigit.length() == 1) {
                   char ch = hexDigit.charAt(0);
                   int decimal = Character.digit(ch, 16); 
                   String binary = Integer.toBinaryString(decimal); 
       
                   System.out.println("The binary equivalent of " + hexDigit + " is: " + binary);
               } else {
                   System.out.println("Invalid input. Please enter a single hex digit.");
               }


    }
}
