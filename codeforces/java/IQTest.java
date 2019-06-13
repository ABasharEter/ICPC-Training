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
import javafx.print.Collation;
import javafx.util.Pair;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author informatic
 */
public class IQTest {
    public static void main(String[] args) throws IOException {
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int n=parseInt(in.readLine());
StringTokenizer str=new StringTokenizer(in.readLine());

int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            int d=parseInt(str.nextToken());
            a[i]=d&1;
        }
        int result=0;
       if(a[0]==0)
           if((a[1]==0&&a[2]==0)||(a[1]==0&&a[2]==1)||(a[1]==1&&a[2]==0))
              result=findOdd(a);
           else result=findEven(a);
       else 
           if(a[1]==1&&a[2]==1||(a[1]==0&&a[2]==1)||(a[1]==1&&a[2]==0))
              result=findEven(a);
           else result=findOdd(a);
        System.out.println(result);
}
public static int findOdd(int a[])
{
    for (int i = 0; i < a.length; i++) {
        if(a[i]==1)return i+1;
    }
    return 0;
}
public static int findEven(int a[])
{
    for (int i = 0; i < a.length; i++) {
        if(a[i]==0)return i+1;
    }
    return 0;
}
}