import java.util.Scanner;

           
public class brain {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt(),m=in.nextInt();String r="#Black&White";
        char a[][]=new char[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            { 
                a[i][j]=in.next().charAt(0);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
              if(a[i][j]=='C'|| a[i][j]== 'M'||a[i][j]=='Y'){r="#Color";break;}
        }
        System.out.println(r);
        }  
        
   }
   