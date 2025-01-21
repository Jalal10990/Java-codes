import java.util.Random;
public class labTask4a {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(26) + 65; // Generate a random integer between 65 and 90
        char randomChar = (char) randomInt;
        System.out.println("Random uppercase letter: " + randomChar);
    }
}

