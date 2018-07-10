import java.util.Scanner;

           
public class Expression {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        int d[]=new int [6];
        d[0]=a+b+c;
        d[1]=a*b*c;
        d[2]=a+b*c;
        d[3]=a*b+c;
        d[4]=a*(b+c);
        d[5]=(a+b)*c;
        int max =d[0];
        for(int i=1;i<6;i++)
            if(d[i]>max)max=d[i];
        System.out.println(max);
   }
}