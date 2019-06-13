import java.util.Scanner;

 
public class LuckyDivision {

         
    public static void main(String[] args) {
     
  Scanner in = new Scanner(System.in);
    String n=in.next();//yes
    if ( isLucky(n) || Integer.parseInt(n)%4==0 || Integer.parseInt(n)%7==0)
        System.out.println("YES");
    else  System.out.println("NO");
  }
        public static boolean isLucky(String num)
    {  
        Integer p= Integer.parseInt(num);
        if ((p%44==0||p%77==0||p%47==0||p%74==0||p%444==0||p%447==0||p%477==0||p%474==0||p==774||p==777||p==744||p==777||p==747)&&(p!=0) )
            return true;
       else return false;
    }
}  