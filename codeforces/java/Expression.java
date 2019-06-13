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
public class Expression{

    public static void main(String[] args) throws IOException {
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//StringTokenizer str=new StringTokenizer();
int a=parseInt(in.readLine()),b=parseInt(in.readLine()),c=parseInt(in.readLine());
int out[]=new int[8];
out[0]=a+b+c;
out[1]=a*b*c;
out[2]=a+b*c;
out[3]=a*b+c;
out[4]=(a+b)*c;
out[5]=a+(b*c);
out[6]=(a*b)+c;
out[7]=a*(b+c);
int max=out[0];
        for (int i = 1; i < 8; i++) {
            if(out[i]>max)max=out[i];
        }
        System.out.println(max);

    }
  
}