import java.util.Scanner;
import java.util.ArrayList;
            
public class RotateIt {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//yes
     int t=in.nextInt(),c=0;
     int test []= new int [t];
        while(c!=t)
        {
            int n=in.nextInt(),sum[]=new int[n],help;
         ArrayList <Integer> a=new ArrayList<Integer>();
         for(int i =0 ; i < n;i++)
         { a.add(in.nextInt());}
         for(int i=0;i< n;i++)
         {if(i==0){for(int j=0; j < n;j+=2)
                 sum[i]=sum[i]+a.get(j);continue;}
             help=a.remove(0);a.add(help);
             for(int j=0; j < n;j+=2)
                 sum[i]=sum[i]+a.get(j);
         }
         int max=sum[0];
         for(int i=1;i< n;i++)
         {
             if(sum[i]>max)max=sum[i];
         }
         test[c]=max;
            c++;
        }
        for(int i=0;i< t;i++)
        {
            System.out.println(test[i]);
        }
   }
  
}
