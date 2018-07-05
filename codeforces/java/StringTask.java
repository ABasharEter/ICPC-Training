import java.util.Scanner;


public class StringTask {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input =in.nextLine();
        String outPut="";
      String help; 
        for(int i = 0 ; i < input.length() ; i++)
        {      
            help = input.charAt(i)+"" ;
            if (help.equalsIgnoreCase("a")||help.equalsIgnoreCase("e")||help.equalsIgnoreCase("i")||help.equalsIgnoreCase("o")
                    ||help.equalsIgnoreCase("u")||help.equalsIgnoreCase("y")) continue;
            else outPut =outPut +'.'+ help.toLowerCase();
                
        }
        System.out.println(outPut);
    }
}