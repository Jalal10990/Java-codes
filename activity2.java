public class activity2 {
    public static void main(String[] args) {
        int[][] array = new int[3][3]; // 3x3 array
        int start = 11; // Starting number
        int primeCount = 0; // Counter for prime numbers

        // Initializing the 3x3 array with natural numbers starting from 11
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = start++;
            }
        }

        // Count the number of prime numbers in the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (isPrime(array[i][j])) {
                    primeCount++;
                }
            }
        }

        // Display the array and the count of prime numbers
        System.out.println("The 3x3 array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The number of prime numbers in the array is: " + primeCount);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, not a prime number
            }
        }
        return true; // Number is prime
    }
}
