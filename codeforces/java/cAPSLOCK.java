import java.util.Scanner;


public class cAPSLOCK {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
 String input=in.next(),rest ;
     char start=input.charAt(0);int found=0;
     for (int j =0;j<input.length();j++)
     {   
         if(Character.isUpperCase(input.charAt(j)))
             found++;
             
     }
     rest=input.substring(1,input.length());
 if(found==input.length())
 { 
System.out.println(Character.toLowerCase(start)+rest.toLowerCase());}
 else if(found==input.length()-1)
 if(Character.isLowerCase(input.charAt(0)))  
         System.out.println(Character.toUpperCase(start)+rest.toLowerCase());
    
 else System.out.println(input);
 else System.out.println(input);
}
}
