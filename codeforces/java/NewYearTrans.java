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
public class NewYearTrans{
static Stack  stack = new Stack<Integer>();
    public static void main(String[] args) throws IOException {
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer str=new StringTokenizer(in.readLine());
int n=parseInt(str.nextToken()),t=parseInt(str.nextToken());
boolean a[][]=new boolean[n][n+1];
str=new StringTokenizer(in.readLine());
        for (int i = 0; i < n-1; i++) {
           a[i][parseInt(str.nextToken())+i]=true;
           
        }
  
      String s=  dfs(a,0);
      if(s.contains((t-1)+""))System.out.println("YES");
      else System.out.println("NO");
       
}
  public static String dfs(boolean adjacency_matrix[][], int source)
    {
        String outdfs="";
        int number_of_nodes = adjacency_matrix[source].length - 1;
 
        int visited[] = new int[number_of_nodes + 1];		
       Integer element = source;		
        int i = source;		
        outdfs+=element;	
        visited[source] = 1;		
        stack.push(source);
 
        while (!stack.isEmpty())
        {
            element =(Integer) stack.peek();
            i = element;	
	    while (i <= number_of_nodes)
	    {
     	        if (adjacency_matrix[element][i]  && visited[i] == 0)
	        {
                    stack.push(i);
                    visited[i] = 1;
                    element = i;
                    i = 1;
                    outdfs+=element;
	            continue;
                }
                i++;
	    }
            stack.pop();	
        }
        return outdfs; 
    }

}