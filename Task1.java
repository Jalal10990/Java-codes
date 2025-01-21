import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ratings = new int[40];
        int[] frequency = new int[11]; // Index 0 unused; ratings are 1 to 10.

        System.out.println("Enter 40 ratings (1 to 10):");
        for (int i = 0; i < ratings.length; i++) {
            int rating;
            do {
                System.out.print("Rating " + (i + 1) + ": ");
                rating = scanner.nextInt();
                if (rating < 1 || rating > 10) {
                    System.out.println("Invalid rating. Please enter a value between 1 and 10.");
                }
            } while (rating < 1 || rating > 10);
            ratings[i] = rating;
            frequency[rating]++;
        }

        // Display the summary of results
        System.out.println("\nSummary of Poll Results:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Rating " + i + ": " + frequency[i] + " responses");
        }
    }
}
