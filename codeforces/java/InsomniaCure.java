import java.util.Scanner;

 
public class InsomniaCure {

         
    public static void main(String[] args) {
     
  Scanner in = new Scanner(System.in);
    int k,l,m,n,d,result=0;
    k=in.nextInt();l=in.nextInt();m=in.nextInt();n=in.nextInt();d=in.nextInt();
    for(int i =1 ; i<=d; i++)
    {
        if ( i%k==0 || i%l==0 || i%m==0 || i%n==0)
            result++;
    }
    if(k==1||l==1||m==1||n==1)result=d;
    System.out.println(result);
  }
  
}   