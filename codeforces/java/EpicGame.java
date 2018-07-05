import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import javafx.print.Collation;
import javafx.util.Pair;

/**
 *
 * @author informatic
 */
public class EpicGame{

    public static void main(String[] args) throws IOException {
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer str=new StringTokenizer(in.readLine());
int a=parseInt(str.nextToken()),b=parseInt(str.nextToken()),n=parseInt(str.nextToken()),win=0,turn=1;
      while(n!=0)
      {
          if(turn==1){n-=gcd(a,n);win=0;turn=2;}
          else{turn=1;win=1;n-=gcd(b,n);}
      }
        System.out.println(win);
}
    public static int gcd( int a, int b )
{
if( a < b )
return gcd( b, a );
// a >= b
if( b == 0 )
return a;
boolean aIsOdd = a % 2 == 1;
boolean bIsOdd = b % 2 == 1;
if( !aIsOdd && !bIsOdd )
return 2 * gcd( a/2, b/2 );
if( !aIsOdd && bIsOdd )
return gcd( a/2, b );
if( aIsOdd && !bIsOdd )
return gcd( a, b/2 );
return gcd( (a+b)/2, (a-b)/2 );
}

}