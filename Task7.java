import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void printMatrix(int n) {
        Random random = new Random();

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                int value = random.nextInt(2); 
                System.out.print(value + " ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the size of the matrix (n): ");
        int n = input.nextInt();

       
        printMatrix(n);

        input.close();
    }
}
