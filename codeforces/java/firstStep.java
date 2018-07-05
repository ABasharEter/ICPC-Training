import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author informatic
 */
public class ACM {

    
    public static void main(String[] args) {
  Scanner in =new Scanner(System.in);
  int n=in.nextInt(),theLongestProgres=1;
int a[]=new int[n];
ArrayList<Integer> mx=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if(a[i+1]>=a[i])
                theLongestProgres++;
            else {mx.add(theLongestProgres); theLongestProgres=1;}
        }
        mx.add(theLongestProgres);
        int max=0;
        for (int i = 0; i < mx.size(); i++) {
            if(mx.get(i)>max)max=mx.get(i);
        }
        System.out.println(max);
        
    }
    
    
}