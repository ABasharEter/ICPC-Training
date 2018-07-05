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
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;
/**
 *
 * @author informatic
 */
public class CompileError{

       public static void main(String[] args) throws IOException {
//BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer str;
int n=parseInt(in.readLine());
Integer a[]=new Integer[n];
Integer b[]=new Integer [n-1];
Integer c[]=new Integer[n-2];
str=new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            a[i]=parseInt(str.nextToken());
        }
str=new StringTokenizer(in.readLine());
        for (int i = 0; i < n-1; i++) {
            b[i]=parseInt(str.nextToken());
        }
str=new StringTokenizer(in.readLine());
        for (int i = 0; i < n-2; i++) {
            c[i]=parseInt(str.nextToken());
        }
Collections.sort(Arrays.asList(a));
Collections.sort(Arrays.asList(b));
Collections.sort(Arrays.asList(c));
int x=0,y=0,i;
      
        for ( i = 0; i < n-1; i++) {
            if(!a[i].equals(b[i])){x=a[i];break;}
        }
       
        if(x==0)x=a[a.length-1];
     for (i=0; i < n-2; i++) {
            if(!b[i].equals(c[i])){y=b[i];break;}
        }
      if(y==0)y=b[b.length-1];
        System.out.println(x+"\n"+y);
    }

}
