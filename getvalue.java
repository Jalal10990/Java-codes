
import java.io.FileWriter;

import java.io.IOException;

  //create a file and user input
import java.util.Scanner;
public class getvalue {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  System.out.println("Enter text to print");
String userInput = sc.nextLine();

try{
     FileWriter writer = new FileWriter("getValue from user");

      writer.write(userInput);
      writer.close();
     System.out.println("file is sucessful");
    }
     catch(IOException e){

        System.out.println("error occured "+ e.getMessage());
     }
     sc.close();
}
    
}