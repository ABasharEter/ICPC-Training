import java.util.Scanner;

 
public class GeorgeAndAccommodtion {

         
    public static void main(String[] args) {
     
  Scanner in = new Scanner(System.in);
    int n = in.nextInt(),help,result=0;
    int r[][] =new int [n][2];
    for(int i = 0 ; i < n ; i++)
    {  for(int j =0 ;  j <2 ; j++)
            r[i][j]=in.nextInt();
       help = r[i][1]-r[i][0];
       if(help >=2)result++;
    }       
    System.out.println(result);
  }
  
}  