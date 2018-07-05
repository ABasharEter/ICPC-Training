import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class LittleElephantAndRozdil {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a []=new int[n];
        for(int i =0 ; i<n;i++)
        {
            a[i]=in.nextInt();
        }
        if(frec(a))
            System.out.println("Still Rozdil");
        else
        {
           int min=a[0],index=1;
           for(int i=1 ; i< n; i++)
               if(a[i]<min)
               {min=a[i];index=i+1;}
           System.out.println(index);
        }
}
    public static boolean frec(int a[])
    {
        int min=a[0],index=0;
        for (int i=1 ; i< a.length;i++)
            if(a[i]<min){min=a[i];index=i;}
        for(int i =0 ; i< a.length ; i++)
        {
           if(i==index)continue; 
           if(a[i]==min)return true; 
        }
           
        return false;
    }
}