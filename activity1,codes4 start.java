import java.util.Scanner;
public class activity1 {
public static void main(String[] args) {
    Scanner jalal=new Scanner(System.in);

    int[][] array = new int[3][4]; 
    int[] rowSum = new int[3]; // Array to store the sum of each row

    System.out.println("Enter the elements of the 3x4 array:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print("Enter element for row " + (i + 1) + ", column " + (j + 1) + ": ");
            array[i][j] = jalal.nextInt();
        }
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            rowSum[i] += array[i][j];
        }
    }
    System.out.println("Sum of each row:");
    for (int i = 0; i < 3; i++) {
        System.out.println("Row " + (i + 1) + ": " + rowSum[i]);
    }

}
    
}