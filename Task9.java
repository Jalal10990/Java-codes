import java.util.Scanner;

public class Task9 {
    public static double power(double a, int n) {
       
        if (n == 0) {
            return 1;
        }
        
        return a * power(a, n - 1);
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a positive real number (a): ");
        double a = input.nextDouble();

        System.out.print("Enter a non-negative integer (n): ");
        int n = input.nextInt();

        
        double result = power(a, n);
        System.out.println("The result of " + a + " raised to the power of " + n + " is: " + result);

        input.close();
    }
}
