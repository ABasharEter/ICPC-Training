import java.util.Scanner;

 


public class DominoPiling  {
 
    public static void main(String[] args) {
    
           Scanner in = new Scanner (System.in);
      int a[]=new int [2];
      a[0]=in.nextInt();a[1]=in.nextInt();
      int s=a[0]*a[1];
      System.out.println(s/2);
    }
}