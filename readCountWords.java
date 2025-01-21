import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class readCountWords {
    public static void main(String[] args) {
        int wordCount = 0;
       

        try {
            BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"));
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                wordCount += words.length;
            }
            
            reader.close();
            System.out.println("Total words in file: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

    }
}
