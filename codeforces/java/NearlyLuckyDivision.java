import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class NearlyLuckyDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    String n=in.next();
    if ( isNearlyLucky(n) )
        System.out.println("YES");
    else  System.out.println("NO");
}
    public static boolean isNearlyLucky(String num)
    {  
       int notLucky=0,help;
       for (int i =0 ; i< num.length();i++)
       {
           help=(int)num.charAt(i);
           help-=48;//for ASCCI code
           if(help ==4 || help ==7) 
               { notLucky++;}
       }
       if (notLucky==4||notLucky==7)return true;
       else return false;
    }
}