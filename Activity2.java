public class Activity2 {
public static void findGrade(double score){

if(score>=90){
    System.out.println('A');
}else if(score>=80){
    System.out.println('B');
}else if(score>=70){
    System.out.println('C');
}else if(score>=60){
    System.out.println('D');
}else{
    System.out.println('F');
}
}
   public static void main(String[] args) {
    System.out.print("The grade is "); 
findGrade(40.5); 
System.out.print("The grade is "); 
findGrade(89.5); 
   } 
}
