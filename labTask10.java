import java.util.Scanner;
public class labTask10 {
    public static void main(String[] args) {
        Scanner jalal=new Scanner(System.in);
        System.out.print("Enter a string: ");
               String str = jalal.nextLine(); 
       
               // Third character
               System.out.println(str.charAt(2));
       
               // Second to last character
               System.out.println(str.charAt(str.length() - 2));
       
               // First five characters
               System.out.println(str.substring(0, 5));
       
               // All but last two characters
               System.out.println(str.substring(0, str.length() - 2));
       
               // Every second character starting from the first
               for (int i = 0; i < str.length(); i += 2) {
                   System.out.print(str.charAt(i));
               }
               System.out.println();
       
               // Every second character starting from the second
               for (int i = 1; i < str.length(); i += 2) {
                   System.out.print(str.charAt(i));
               }
               System.out.println();
       
               // Reverse the string
               for (int i = str.length() - 1; i >= 0; i--) {
                   System.out.print(str.charAt(i));
               }
               System.out.println();
       
               // Every second character in reverse order
               for (int i = str.length() - 2; i >= 0; i -= 2) {
                   System.out.print(str.charAt(i));
               }
               System.out.println();
       
               // Length of the string
               System.out.println(str.length());

    }
}
