import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class TPrimes {
    

    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
  int t=in.nextInt();
  String a[]=new String[t];
  for(int i=0;i<t;i++)
  {
      long q=in.nextLong(), h=0;
      for(int j=1;j<=q;j++)
      {
          if(q%j==0)h++;
 if(h>3){a[i]="No";break;}
      }
      if(h==3)a[i]="YES";
      else a[i]="NO";
          }
  for(int i=0;i<t;i++)
      System.out.println(a[i]);
}
}