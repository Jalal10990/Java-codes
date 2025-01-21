import java.util.Scanner;

public class activity4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int[] copiedArray = new int[10];
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input elements in array");
            System.out.println("2. Search element and its location");
            System.out.println("3. Find largest & smallest value in the array");
            System.out.println("4. Copy data to another array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputArray(array);
                    displayArray(array);
                    break;
                case 2:
                    System.out.print("Enter element to search: ");
                    int searchKey = scanner.nextInt();
                    int location = search(array, searchKey);
                    if (location != -1) {
                        System.out.println("Element found at index: " + location);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 3:
                    findLargestAndSmallest(array);
                    displayArray(array);
                    break;
                case 4:
                    copyData(array, copiedArray);
                    System.out.println("Original Array:");
                    displayArray(array);
                    System.out.println("Copied Array:");
                    displayArray(copiedArray);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    // Method to input elements into the array
    public static void inputArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    // Method to display elements of the array
    public static void displayArray(int[] array) {
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to search for an element in the array
    public static int search(int[] array, int searchKey) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchKey) {
                return i;
            }
        }
        return -1;
    }

    // Method to find the largest and smallest elements and rearrange the array
    public static void findLargestAndSmallest(int[] array) {
        int largest = array[0];
        int smallest = array[0];
        int largestIndex = 0;
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
                largestIndex = i;
            }
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }

        // Place largest at index 0 and smallest at index 9
        int temp = array[0];
        array[0] = largest;
        array[largestIndex] = temp;

        temp = array[9];
        array[9] = smallest;
        array[smallestIndex] = temp;

        System.out.println("Largest element placed at index 0 and smallest at index 9.");
    }

    // Method to copy data from one array to another
    public static void copyData(int[] array, int[] copiedArray) {
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        System.out.println("Data copied successfully.");
    }
}
