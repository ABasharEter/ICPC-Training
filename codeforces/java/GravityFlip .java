import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.util.StringTokenizer;

/**
 *
 * @author informatic
 */
public class GravityFlip  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer=new StringTokenizer(in.readLine());
        int n=parseInt(tokenizer.nextToken());
        int a[]=new int[n],max=0;
        tokenizer=new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            a[i]=parseInt(tokenizer.nextToken());
            if(a[i]>max)max=a[i];
        }
        int b[]=new int[max+1];
        for (int i = 0; i < n; i++) {
            b[a[i]]++;
        }
        for (int i = 1; i < b.length; i++) {
            if(b[i]!=0)
                print(i,b[i]);
        }
    }
    static void print(int num,int count){
        for (int i = 0; i < count; i++) {
            System.out.print(num+" ");
        }
    }
    
}