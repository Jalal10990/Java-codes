
import java.util.Scanner;
public class Activity1 {
    public static int max(int num1, int num2){
       int result;
if(num1>num2)
    result =num1;
else
    result=num2;
return result;
    }
    public static void main(String[] args) {
Scanner jalal = new Scanner(System.in);
    
int a=7;
int b=9;
int c=max(a,b);
System.out.println("the maximum of "+a+" and "+b+" is "+c);

}
}