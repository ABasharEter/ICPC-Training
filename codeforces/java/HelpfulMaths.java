import java.util.Arrays;
import java.util.Scanner;
public class HelpfulMaths  {
 
    public static void main(String[] args) {
           Scanner in = new Scanner (System.in);
        String a =in.next(),help;int s[]=new int [a.length()/2+1];
        for(int i=0,j=0;i<a.length();i+=2,j++)
        {   
            help=a.charAt(i)+"";
            s[j]=Integer.parseInt(help);
        }
        Arrays.sort(s);
        String result="";
        for(int i=0 ;i<s.length;i++)
        {
            if(i==s.length-1)result=result+""+s[i];
          else  result=result+s[i]+""+"+";
        }
        System.out.println(result);
        
     }
}