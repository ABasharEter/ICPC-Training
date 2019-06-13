

import java.util.Scanner;


public class NextRound {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int []a= new int[2];
        a[0]=input.nextInt();
        a[1]=input.nextInt();
        int []b= new int [a[0]];
        for (int i=0; i<a[0];i++)
            b[i]= input.nextInt();
        int result=a[1];
            if(b[a[1]-1]!=0)
                for(int i=a[1]; i<a[0];i++)
                    if(b[i-1]==b[i]) result++;
                    else  break;
            else {
         result=0;
         for(int i=0; i<a[0];i++)
             if(b[i]==0)  break;
             else result++; 
            }
            System.out.println(result);
        
    }
}
