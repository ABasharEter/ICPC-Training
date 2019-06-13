import java.util.Scanner;


public class Team {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int index=0,output=0;
      int n=in.nextInt();
      byte [][] a = new byte [n][3];
      for(int i = 0 ;i < n ; i++)
      {
          a[i]=new byte [3];
          for(int j =0 ;j < 3; j++)
          {
              a[i][j]=in.nextByte();
              if(a[i][j]==1) index++;
          }
          if(index>1)output++;index=0;
      }
      System.out.println(output);
    }
}