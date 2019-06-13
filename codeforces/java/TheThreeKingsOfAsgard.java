

import java.util.Scanner;
            
public class TheThreeKingsOfAsgard {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(), c=0;
        int test[][]=new int [t][3];
        while(c!=t)
        {
            int N=in.nextInt();
            int a[]={N,N,N};
            a[0]=a[0]/2;
            a[2]=a[2]+a[0];
            a[2]=a[2]/2;
            a[1]=a[1]+a[2];
            a[1]=a[1]/2;
            a[0]=a[0]+a[1];
            int b[]=new int[3];
            b[0]=a[0];b[1]=a[1];b[2]=a[2];
            if(possible(a,N))
               test[c]=b;
             else   test[c][0]=test[c][1]=test[c][2]=-1;
            c++;
        }
        for(int i=0 ; i< t;i++)
        {
            if(test[i][0]==-1&&test[i][1]==-1&&test[i][2]==-1)
                 System.out.println("Impossible");
            else System.out.println(test[i][0]+" "+test[i][1]+" "+test[i][2]);
        }
   }
    public static boolean possible(int b[],int N)
    {
          int a[]=new int [3];
          a[0]=b[0];a[1]=b[1];a[2]=b[2];
            a[0]=a[0]-a[1];
            a[1]=2*a[1];
            a[1]=a[1]-a[2];
            a[2]=2*a[2];
            a[2]=a[2]-a[0];
            a[0]=2*a[0];
            if(a[0]==N&&a[1]==N&&a[2]==N)
                return true;
            else return false;
    }
}
