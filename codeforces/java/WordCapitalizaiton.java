import java.util.Scanner;


public class WordCapitalizaiton {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
     String a=in.next();
     System.out.println(Character.toUpperCase(a.charAt(0))+a.substring(1, a.length()));
 }
}