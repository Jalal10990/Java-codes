import java.util.Scanner; 

public class Task1 { 
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        // Define a 3x4 array
        int[][] array = new int[3][4]; 
        
        // Input: Accept the 3x4 integer array from the user  
        System.out.println("Enter the elements of the 3x4 array row by row:");  
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 4; j++) {  
                System.out.print("Enter element [" + i + "][" + j + "]: "); 
                array[i][j] = scanner.nextInt();  
            } 
        } 
        
        // Variables to store the maximum row sum and its index  
        int maxRowSum = Integer.MIN_VALUE; 
        int maxRowIndex = -1; 
        
        // Step 1: Calculate row sums and find the maximum  
        for (int i = 0; i < 3; i++) { 
            int rowSum = 0;  
            for (int j = 0; j < 4; j++) {  
                rowSum += array[i][j]; 
            } 
            if (rowSum > maxRowSum) {  
                maxRowSum = rowSum; 
                maxRowIndex = i;  
            } 
        } 
        
        // Output the result 
        System.out.println("The row with the maximum sum is row " + (maxRowIndex + 1) + " with a sum of " + maxRowSum);  
    } 
}