import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class Puzzles {
    

    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
  int n=in.nextInt(),m=in.nextInt();
  int a[]=new int[m];
  int s[]=new int[m-n+1];
  for(int i=0;i<m;i++)
  {
      a[i]=in.nextInt();
  }
  Arrays.sort(a);
  for(int i=0;i<=m-n;i++)
  {
      s[i]=a[n+i-1]-a[i];
  }
  int min=s[0];
  for(int i=0;i<m-n+1;i++)
  {
      if(s[i]<min)min=s[i];
  }
  System.out.println(min);
}
}