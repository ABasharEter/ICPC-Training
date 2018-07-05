import java.util.Scanner;


public class BoyOrGirl {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
         String A =in.next();int a =A.length();
     for(int i =0 ;i<A.length();i++)
     {
         for (int j=i+1 ; j<A.length();j++)
             if(A.charAt(i)==A.charAt(j))
             { a--;break;}
     }
     if(a%2!=0)
         System.out.println("IGNORE HIM!");
     else System.out.println("CHAT WITH HER!");
 }
}
