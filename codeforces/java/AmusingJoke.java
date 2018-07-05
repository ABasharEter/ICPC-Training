import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author informatic
 */
public class ACM {

    
    public static void main(String[] args) {
  Scanner in =new Scanner(System.in);
 String first=in.next(),seconned=in.next(),third=in.next();
 String comp=first+seconned;
 char a[]=comp.toCharArray();
 Arrays.sort(a);
 comp="";
        for (int i = 0; i < a.length; i++) {
         comp+=a[i];   
        }
 a=third.toCharArray();
 Arrays.sort(a);
third="";
        for (int i = 0; i < a.length; i++) {
         third+=a[i];   
        }
 System.out.println(comp.equals(third)?"YES":"NO");
    }
    
    
}