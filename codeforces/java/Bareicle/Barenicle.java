import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class Barenicle {
    

    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
     String input=in.next();int i=0,j=0;
     for( i=0 ; i<input.length();i++)
         if(input.charAt(i)=='e')break;
     double a=Double.parseDouble(input.substring(0,i));
     int b=Integer.parseInt(input.substring(i+1,input.length()));
     double x=a*Math.pow(10, b);
     String output=""+x;
     for( j=0;j<input.length();j++)
         if(output.charAt(j)=='.')break;
     if(output.charAt(j+1)=='0')
     System.out.println(output.substring(0, j));
     else
         System.out.println(x);
         
}
}