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
public class YoungPhysicist{

    public static void main(String[] args) throws IOException {
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer str;
int n=parseInt(in.readLine());
int a[]=new int [3];
        for (int i = 0; i < n; i++) {
            str=new StringTokenizer(in.readLine());
            a[0]+=parseInt(str.nextToken());
            a[1]+=parseInt(str.nextToken());
            a[2]+=parseInt(str.nextToken());
        }
        if(a[0]==0&&a[1]==0&&a[2]==0)
            System.out.println("YES");
        else System.out.println("NO");
    }
  
}