import java.util.Scanner;
public class labAct3 {              //compareTo() method 
    public static void main(String[] args) {
       Scanner jalal = new Scanner(System.in);
 // Prompt user for city names
 System.out.print("Enter the first city: ");
 String city1 = jalal.nextLine();

 System.out.print("Enter the second city: ");
 String city2 = jalal.nextLine(); 


 // Compare cities using compareTo()    
 int comparison = city1.compareTo(city2);

 // Display cities in alphabetical order
 if (comparison < 0) {
     System.out.println("The cities in alphabetical order are: " + city1 + ", " + city2);
 } else if (comparison > 0) {
     System.out.println("The cities in alphabetical order are: " + city2 + ", " + city1);
 } else {
     System.out.println("The cities are the same: " + city1);
 }




    }
}
