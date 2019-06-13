import java.util.Scanner;

            
public class Translation {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   String a=in.nextLine(),b=in.nextLine(),c="";
   for(int i=b.length()-1;i>=0;i--)
       c+=b.charAt(i);
   if(a.equals(c))System.out.println("YES");
   else System.out.println("NO");
   }
    
}
