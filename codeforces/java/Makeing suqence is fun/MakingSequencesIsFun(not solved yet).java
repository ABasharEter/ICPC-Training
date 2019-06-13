import java.util.Scanner;
/**
 *
 * @author Abdulmalek
 */
public class MakingSequencesIsFun {
    

    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
  long w=in.nextLong(),m=in.nextLong(),k=in.nextLong(),i=0;
  String d=""+m;
  if(w<k||w<d.length())
  {System.out.println(0);System.exit(0);}
  while(w>0)
  {
     
      w-=S(m+i)*k;
       i++;
  }
  if(w<0)
   System.out.println(i-1);
  else System.out.println(i);
}
    public static int S(long m)
    {
        String d=""+m;
        return d.length();
    }
}
