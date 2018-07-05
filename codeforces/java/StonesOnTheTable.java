
import java.util.Scanner;


public class StonesOnTheTable {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt(),result=0;
      String a=in.next();
      for(int i=0;i<a.length()-1;i++)
          if(a.charAt(i)==a.charAt(i+1))result++;
      System.out.println(result);
 }
}