import java.util.Scanner;


public class HQ9 {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String a=in.next();
      char ch;int index=0;
      for(int i=0;i<a.length();i++)
      {   ch=a.charAt(i);
          if(ch=='H'||ch=='Q'||ch=='9')
          {index=1;break;}
      }
      if(index==1)
          System.out.println("YES");
      else
          System.out.println("NO");
 }
}