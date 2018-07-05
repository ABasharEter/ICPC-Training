import java.util.Scanner;


public class Tram {

    
    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
        short n =in.nextShort();int help=0;
       int a [][] =new int[n][2];
      for (int j =0 ;j<n; j++)
        for (int i =0 ;i<2;i++) 
                a[j][i]=in.nextInt();
      int result =a[0][1];
      for (int i =0;i<n;i++)
      {    help =help+a[i][1]-a[i][0];
           if ( result < help ) result = help ;
      }
      System.out.println ( result ) ;

    }
}