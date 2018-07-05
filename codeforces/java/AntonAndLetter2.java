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

/**
 *
 * @author informatic
 */
public class AntonAndLetter2 {
static Stack  stack = new Stack<Integer>();
    public static void main(String[] args) throws IOException {
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
String n=in.readLine();
TreeSet <Character> a=new TreeSet<>();
      for (int i =1 ;i<n.length()-1;i+=3){
            a.add(n.charAt(i));
        }
  
        System.out.println(a.size());
       
}


}