import java.util.Scanner;
public class labtask7 {
    public static void main(String[] args) {
        
Scanner jalal = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = jalal.nextLine();

        int firstIndex = inputString.indexOf('f');
        int lastIndex = inputString.lastIndexOf('f');

        if (firstIndex != -1) {
            if (firstIndex == lastIndex) {
                System.out.println("The letter 'f' occurs at index: " + firstIndex);
            } else {
                System.out.println("The first occurrence of 'f' is at index: " + firstIndex);
                System.out.println("The last occurrence of 'f' is at index: " + lastIndex);
            }
        }



    }
}
