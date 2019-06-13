
import java.util.Scanner;

public class WayTooLongWord {
     
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      int n=in.nextInt()+1;
        String []a =new String [n];
              for(int i=0;i<n;i++)
              {
              a[i]=in.nextLine();
              
                  
              }
              for(int i=1;i<n;i++)
                  if(a[i].length()>10)
                  {  System.out.print(a[i].charAt(0));
                          System.out.print(a[i].length()-2);
                  System.out.println(a[i].charAt(a[i].length()-1));}
                  else System.out.println(a[i]);

              
    }
}
