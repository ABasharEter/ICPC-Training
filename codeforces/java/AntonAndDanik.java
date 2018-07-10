
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.util.StringTokenizer;



/**
 *
 * @author informatic
 */
public class AntonAndDanik {

    public static void main(String[] args) throws IOException  {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer=new StringTokenizer(in.readLine());
        int n=parseInt(tokenizer.nextToken()),a=0,d=0;
        tokenizer=new StringTokenizer(in.readLine());
        StringBuilder s=new StringBuilder(tokenizer.nextToken());
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A'){
                a++;
            } else{
                d++;
            }
        }
        if(a>d){
            System.out.println("Anton");
        } else if(d>a){
            System.out.println("Danik");
        } else{
            System.out.println("Friendship");
        }
}
}