import java.util.Scanner;


public class PetyaAndString {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
    String input1=in.next(),input2=in.next();
  if(input1.equalsIgnoreCase(input2))
          System.out.println('0'); 
  else if(input1.compareToIgnoreCase(input2)<0)
      System.out.println("-1");
  else if(input1.compareToIgnoreCase(input2)>0)
      System.out.println('1');
 }
}