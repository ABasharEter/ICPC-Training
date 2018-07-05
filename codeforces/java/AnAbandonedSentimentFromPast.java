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
public class AnAbandonedSentimentFromPast {

    public static void main(String[] args) throws IOException {
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer str=new StringTokenizer(in.readLine());
int n=parseInt(str.nextToken()),k=parseInt(str.nextToken());
int a[]=new int[n];
Integer kk[]=new Integer[k];
str=new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            a[i]=parseInt(str.nextToken());
        }
        str=new StringTokenizer(in.readLine());
        for (int i = 0; i < k; i++) {
            kk[i]=parseInt(str.nextToken());
        }
        Collections.sort(Arrays.asList(kk),Collections.reverseOrder());
        int f=0;
        for (int i = 0; i < n; i++) {
            if(a[i]==0){a[i]=kk[f];f++;}
        }
        if(isIncreasing(a))
            System.out.println("No");
        else System.out.println("Yes");
}
public static boolean isIncreasing(int[]arr)
{
    for(int i=1; i<arr.length;i++)
    {
        if(arr[i-1]>arr[i])
            return false;
    }
    return true;
 }

}