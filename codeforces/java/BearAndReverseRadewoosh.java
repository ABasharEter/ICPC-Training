
import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class BearAndReverseRadewoosh {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner in = new Scanner(System.in);
        int n=in.nextInt(),c=in.nextInt(),sum1=0,sum2=0,s1=0,s2=0;
        int []p=new int [n];
        int []t=new int [n];
        for (int i = 0 ;i<n;i++)
            p[i]=in.nextInt();
        for (int i = 0 ;i<n;i++)
            t[i]=in.nextInt();
        int max1[]=new int [n];
        int max2 []=new int [n];
        for(int i =0 ; i < n ;i++)
        {
            s1+=t[i];s2+=t[n-i-1];
                max1[i]=maxx(p[i],c,s1);
                max2[i]=maxx(p[n-1-i],c,s2);
                sum1+=max1[i];
                sum2+=max2[i];
         
        }
        if(sum1>sum2)
            System.out.println("Limak");
        else if(sum2>sum1) System.out.println("Radewoosh");
        else System.out.println("Tie");
        
    }
  public static int maxx(int a , int b , int c)
  {
      int s=a-c*b;
      if(s>0)return s;
      else return 0 ;
  }
    
}
