import java.util.Scanner;
public class labTask1 {
   public static void main(String[] args) {
    Scanner jalal= new Scanner(System.in);
    System.out.println("enter the latitude and longitude of point 1 ");
    System.out.println("enter valu of x1");
    double x1=jalal.nextInt();
    System.out.println("enter valu of y1");
    double y1=jalal.nextInt();
    System.out.println("enter the latitude and longitude of point 2 ");
    System.out.println("enter valu of x2");
    double x2=jalal.nextInt();
    System.out.println("enter valu of y2");
    double y2=jalal.nextInt();
// Convert degrees to radians
x1 = Math.toRadians(x1);
y1 = Math.toRadians(y1);
x2 = Math.toRadians(x2);
y2 = Math.toRadians(y2);

double averageOfEarthRadius = 6371.01; 
double distanceX = x2 - x1;
        double distanceY = y2 - y1;
        double a = Math.pow(Math.sin(distanceX / 2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(distanceY / 2), 2);
        double  c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = averageOfEarthRadius * c;

        System.out.println("The great circle distance is " + distance + " km");


   } 
}
