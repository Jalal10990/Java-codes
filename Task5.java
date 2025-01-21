import java.util.Scanner;

public class Task5 {
    public static int countLetters(String s) {
        int count = 0;
        
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        
        int letterCount = countLetters(userInput);
        System.out.println("The number of letters in the string is: " + letterCount);

        input.close();
    }
}
