import java.util.Scanner;

public class Activity5 {
    public static long factorial(int n) {
        if (n == 0) 
        return 1;
        else
        return n * factorial(n - 1);
    }

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 System.out.print("Enter a nonnegative integer: ");
int num = input.nextInt();
 System.out.println("Factorial of " + num + " is " + 
 factorial(num));
 }
    }

