import java.util.Scanner;


public class Bit {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      String []x=new String[n];
      int positive=0,negative=0;char p='+';
      for(int i=0;i<n;i++)
      {
          x[i]=in.next();
          if(x[i].charAt(1)==p)positive++;
          else negative++;
      }
      System.out.println(positive-negative);
    }
}