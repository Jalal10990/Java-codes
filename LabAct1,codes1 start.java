import java.util.Scanner;
public class labAct1{


public static void main(String[] args){

Scanner jalal= new Scanner(System.in);

        System.out.println("enter the x,y coordinates of point 1:");
        double x1 = jalal.nextDouble();
        double y1 = jalal.nextDouble();

        System.out.println("enter the x,y coordinates of point 2:");
        double x2 = jalal.nextDouble();
        double y2 = jalal.nextDouble();

        System.out.println("enter the x,y coordinates of point 3:");
        double x3 = jalal.nextDouble();
        double y3 = jalal.nextDouble();
      //  The Math.sqrt and Math.pow functions are used to calculate the distance between two points using the distance formula.
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
      //  The Law of Cosines is applied to find the angles of the triangle. We use Math.acos to find the angle in radians and then convert it to degrees using Math.toDegrees.
        double angleA = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*b*c)));
        double angleB = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2*a*c)));
        double angleC = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2*a*b)));

        System.out.println("Angle A: " + angleA + " degrees");
        System.out.println("Angle B: " + angleB + " degrees");
        System.out.println("Angle C: " + angleC + " degrees");
}
}