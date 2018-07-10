import java.util.Scanner;

            
public class CountingSticks {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
  String n=in.next(),h1="",h2="",h3="";
  h1=n.substring(0,n.lastIndexOf("="));//sub from end
      h2=n.substring(n.lastIndexOf("=")+1);
      if(Math.abs(h1.length()-1-h2.length())!=2&&h1.length()-1!=h2.length()){System.out.println("Impossible");System.exit(0);}
  if(!isCorrect(n))
  {
      h1=n.substring(0,n.lastIndexOf("="));//sub from end
      h2=n.substring(n.lastIndexOf("=")+1);
      h1+="|";
      h3=h2.substring(0,h2.length()-1);
      h3=h1+"="+h3;
      if(!isCorrect(h3))
      {
          h1=n.substring(0,n.lastIndexOf("="));//sub from start
      h2=n.substring(n.lastIndexOf("=")+1);
     if(h1.substring(0, h1.indexOf("+")).length()==1)
         h3=h1.substring(0,h1.length()-1);
     else h3=h1.substring(1,h1.length());
      h2+="|";
      h3=h3+"="+h2;
      System.out.println(h3);System.exit(0);
      }
      else {System.out.println(h3);System.exit(0);}
  }
  else {System.out.println(n);}
   }
    public static boolean isCorrect(String n)
    {
        int i1=n.indexOf("+");
  int i2=n.indexOf("=");
    if(i1+i2-i1==n.length()-i2)
    {return true;}
    return false;
    }
}
