import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class RankList {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), k=in.nextInt(),help[]=new int[n];
        int [][]a= new int[n][2];
        for(int i =0 ; i< n; i++)
        {
            a[i][0]=in.nextInt();a[i][1]=in.nextInt();
            
        }
   for (int i =0 ; i< n; i++)
   {
       int m1=a[i][0];
       int m2=a[i][1];
       for(int j =i ; j< n ; j++)
           if(a[j][0]>m1)
           {
               int s1 = a[j][0];
               a[j][0]=m1;
               m1=s1;
               int s2=a[j][1];
               a[j][1]=m2;
               m2=s2;
           }
       a[i][0]=m1;
       a[i][1]=m2;
   }
              for(int i =0 ; i< n; i++)
              {   for (int j=0;j<n;j++)
                 if(a[i][0]==a[j][0]&&a[i][1]==a[j][1])help[i]++;
                   }
              System.out.println(help[k-1]);
}}