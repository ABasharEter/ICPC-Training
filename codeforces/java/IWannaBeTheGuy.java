
import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class IWannaBeTheGuy {

    /**
     * @param args the command line arguments
     */
    static int a[];
     static int h[];
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner in = new Scanner(System.in);
        int n=in.nextInt(); 
     int p =in.nextInt();
      a=new int [p];
     for(int i=0;i<p;i++)
         a[i]=in.nextInt();
     int q=in.nextInt(),help=1;
     int b[]=new int [q];
     for(int i =0 ; i < q;i++)
         b[i]=in.nextInt();
     h =new int [p+q];
     for(int i=0;i<p ;i++)
         h[i]=a[i];
     for(int i=0,d=p ; i < q;i++)
         if(!excist(b[i],h.length)){h[d]=b[i];d++;}
     long e=n*(n+1)/2,sum=0;
       for(int i=0;i<p+q ;i++)
        sum+=h[i];
     if(sum>=e)System.out.println("I become the guy.");
     else System.out.println("Oh, my keyboard!");
     
     
    }
    public static boolean excist(int key,int length)
    {
        for(int i=0;i<length;i++)
            if(h[i]==key)return true;
        return false;
    }
    
}
