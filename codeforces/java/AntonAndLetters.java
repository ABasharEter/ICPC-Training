
import java.util.Scanner;
import java.util.ArrayList;
            
public class AntonAndLetters {

public static ArrayList <Character>a=new ArrayList <Character>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n=in.nextLine();;
     for (int i =1 ;i<n.length()-1;i+=3)
     if(isNotFrequenter(n.charAt(i)))  a.add(n.charAt(i));  
    System.out.print(a.size());

    }
 
    public static boolean isNotFrequenter(char num)
    {
       for (int i=0;i<a.size();i++)
           if(a.get(i) == num){return false;}
           return true;
    }
    
}