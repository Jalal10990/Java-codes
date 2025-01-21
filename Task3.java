public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Initialize the array

        System.out.println("Original Array:");
        printArray(array);

        modify(array); // Pass the array to the modify() method

        System.out.println("\nModified Array:");
        printArray(array);
    }

    // Method to multiply each element of the array by 3
    public static void modify(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 3;
        }
    }

    // Method to print array elements
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
