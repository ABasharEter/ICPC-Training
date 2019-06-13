import java.util.Scanner;

           
public class YoungPhysicist {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(),yes;
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=in.nextInt()+in.nextInt()+in.nextInt();
        }
        yes=b[0];
        for(int i=1;i<n;i++)
        {
            yes+=b[i];
        }
        if(yes==0)System.out.println("YES");
        else System.out.println("NO");
   }
}
   