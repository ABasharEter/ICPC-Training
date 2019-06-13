import java.util.Scanner;


public class Football {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int index=0;
    String a=in.next();
     for(int i =1;i<a.length();i++)
     {
         if(a.charAt(i) ==a.charAt(i-1)){
             index++;
             if(index==6)break;
         }
         else index=0;
     }
     if(index>=6)System.out.println("YES");
     else System.out.println("NO");
    }
}