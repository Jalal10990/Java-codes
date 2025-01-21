import java.io.*;
public class fileWrite {
    public static void main(String[] args) throws IOException{
        
FileWriter Fw = new FileWriter("fruits.txt",true);
BufferedWriter Bf =new BufferedWriter(Fw);
PrintWriter Pw = new PrintWriter(Bf);

Pw.println("Apple");
Pw.println("Grapes");
Pw.println("Kiwi");
                              //resding

FileReader Fr =new FileReader("fruits.txt");
BufferedReader br=new BufferedReader(Fr);     
String x;
while((x=br.readLine())!=null){
    System.out.println(x);
}                         


    }
}
