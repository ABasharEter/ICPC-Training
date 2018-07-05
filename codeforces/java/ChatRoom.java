
import java.util.Scanner;


public class ChatRoom {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
     String a=in.next();int index=0,i,j,k,l,m;
   for( i =0 ;i<a.length();i++)
       if(a.charAt(i)=='h') {
           for(j=i+1;j<a.length();j++)
               if(a.charAt(j)=='e'){
                   for(k=j+1;k<a.length();k++)
                       if(a.charAt(k)=='l'){
                           for( l=k+1;l<a.length();l++)
                               if(a.charAt(l)=='l'){
                                   for( m=l+1;m<a.length();m++)
                                   if(a.charAt(m)=='o'){
                                       index=1;
                                       break;
                                   }break;}break;}break;}break;}
      
   if(index==1)System.out.println("YES");
   else System.out.println("NO");
 }
}
