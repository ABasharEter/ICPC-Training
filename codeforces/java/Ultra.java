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
public class Ultra{

    public static void main(String[] args) throws IOException {
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//StringTokenizer str=new StringTokenizer(in.readLine());
String a=in.readLine(),b=in.readLine(),out="";
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i))out+="1";
            else out+="0";
        }
        System.out.println(out);
}
}