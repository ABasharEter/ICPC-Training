import java.util.Scanner;
            
public class Time {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         long a [] [] = new long [2*n][3];
         for(int i =0 ; i< 2*n;i++)
             for (int j=0; j<3;  j++)
             {
                 a[i][j]=in.nextInt();
                 if(j==1)a[i][j]+=a[i][0]*60;
                 if(j==2)a[i][j]+=a[i][1]*60;   
             }
         for(int i =0 ,j=0 ; i<2*n;i+=2,j++)
          if(a[i][2]==a[i+1][2])
              System.out.println("Case "+(j+1)+": Yes");
         else System.out.println("Case "+(j+1)+": No");
                 
                 }   
}