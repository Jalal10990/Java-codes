public class activity3 {
   public static void main(String[] args) {
     // Initialize a 3x4 array
     int[][] originalMatrix = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };

    // Call the transpose method and store the result
    int[][] transposedMatrix = transpose(originalMatrix);

    // Display the original matrix
    System.out.println("Original Matrix:");
    displayMatrix(originalMatrix);

    // Display the transposed matrix
    System.out.println("\nTransposed Matrix:");
    displayMatrix(transposedMatrix);
}

// Method to transpose a matrix
public static int[][] transpose(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    // Create a new matrix for the transpose
    int[][] transposed = new int[cols][rows];

    // Fill the transposed matrix
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            transposed[j][i] = matrix[i][j];
        }
    }

    return transposed;
}

// Method to display a matrix
public static void displayMatrix(int[][] matrix) {
    for (int[] row : matrix) {
        for (int element : row) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
   } 
}
