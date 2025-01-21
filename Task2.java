import java.util.Scanner;

public class Task2 {
    // Function to check if a number is prime
    public static int Factorial(int n) {
        int factorial=1;
        for(int i=1; i<=n;i++){

   factorial = factorial * i;

     }
     System.out.println("the factorial is "+factorial);
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();

       Factorial(n);
    }
}