import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class KefaAndFirstSteps {
    

    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
  int n=in.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
      a[i]=in.nextInt();
  }
  int r=0,h=0;
for(int i=1;i<n;i++)
    if(a[i]>=a[i-1])r++;
    else if(r>h) {h=r;r=0;}
    else {r=0;}
if(r>h)
System.out.println(r+1);
else System.out.println(h+1);
}
}
