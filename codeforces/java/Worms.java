import java.util.Scanner;
/**
 *tle
 * @author Abdulmalek
 */
public class  Worms {
    public static int n;

    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
    n=in.nextInt();
   int a[]=new int[n];
   
   for(int i=0;i<n;i++ )
   {
       a[i]=in.nextInt();
       
   }
   int m=in.nextInt();
   int []b=new int [m];
   for(int i=0;i<m;i++)
   {
     b[i]=in.nextInt();
   }
   int o[][]=new int[n][2];
   int s=0;
   for(int i=0;i<n;i++)
   {
       o[i][0]=s+1;
       s+=a[i];
       o[i][1]=s;
   }
   for(int i=0;i<m;i++)
   {  System.out.println(fet(o,b[i]));}
    }
 public static int fet(int a[][],int b)
 {
     for(int i=0;i<n;i++)
         if(b>=a[i][0]&&b<=a[i][1])return i+1;
     return 0;
 }
}
