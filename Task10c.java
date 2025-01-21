import java.util.Scanner;

public class Task10c {
    public static void reverseSequence(int n) {
        
        if (n == 0) {
            return;
        }

        
        System.out.print(n % 10);

        
        reverseSequence(n / 10);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        System.out.print("Reversed sequence: ");
        reverseSequence(number);
        
        input.close();
    }
}
