import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class ArrivalOfTheGeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
    int result=0, n = in.nextInt(),max=1,min=101,i1=0,i2=0;
    int []a = new int [n];
    for (int i =0 ;  i < n ; i++)
    {
     a[i]= in.nextInt();
     if(a[i]<=min){min=a[i];i1=i;}
     if(a[i]>max){max=a[i];i2=i;}
    }
    if(i1>i2)
        result=n-1-i1+i2;
    if(i1<i2) result= n-i1-1+i2-1;
     System.out.print(result);
}
}
