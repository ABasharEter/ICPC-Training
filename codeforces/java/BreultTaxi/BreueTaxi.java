import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class BreueTaxi {
    

    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
 int x0=in.nextInt(),y0=in.nextInt();
 int n=in.nextInt();
 int a[][]=new int [n][3];
 double t[]=new double  [n];
 for(int i=0;i<n;i++)
 {
     a[i][0]=in.nextInt();
     a[i][1]=in.nextInt();
     a[i][2]=in.nextInt();
     t[i]=Math.sqrt(Math.pow(a[i][0]-x0,2)+Math.pow(a[i][1]-y0, 2))/a[i][2];
 }
 double min=t[0];
 for(int i=1;i<n;i++)
 {
     if(t[i]<min)min=t[i];
 }
 System.out.printf("%.14f ", min);
    }
}