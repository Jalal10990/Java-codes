import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String Function = sc.next();
       Switch(Function);
       if(Function==addition){
        System.out.println("the addition function is in menu");
       }
        break;
        if(Function==division){
            System.out.println("the division function is in menu");
           }
        break;
        if(Function==subtraction){
            System.out.println("the subtraction function is in menu");
           }
        break;
        if(Function==multiplication){
            System.out.println("the multiplication function is in menu");
           }
        break;
        default;
        System.out.println("the no function is in menu"); 
    }Sw
}
