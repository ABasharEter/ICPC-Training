import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
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

public class Way {

    public static void main(String[] args) throws IOException {
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int n=parseInt(in.readLine());
int a[]=new int[n];
StringTokenizer str=new StringTokenizer(in.readLine());
        for (int i = 0; i < n; i++) {
            a[i]=parseInt(str.nextToken());
        }
        sort(a);
           int count=1;
          int min=a[1]-a[0];
        for (int i = 2; i < n; i++) {
             if(a[i]-a[i-1]<min){  
                min = a[i]-a[i-1];  
                count=1;  
            }  
            else  
            if(a[i]-a[i-1] == min){  
                count++;  
            }  
        }
      
        
     
     
        System.out.println(min+ " " +count);
    }
private static int[] numbers;
        private static int[] helper;

        private static int number;

        public static void sort(int[] values) {
                numbers = values;
                number = values.length;
                helper = new int[number];
                mergesort(0, number - 1);
        }

        private static void mergesort(int low, int high) {
                // check if low is smaller than high, if not then the array is sorted
                if (low < high) {
                        // Get the index of the element which is in the middle
                        int middle = low + (high - low) / 2;
                        // Sort the left side of the array
                        mergesort(low, middle);
                        // Sort the right side of the array
                        mergesort(middle + 1, high);
                        // Combine them both
                        merge(low, middle, high);
                }
        }

        private static void merge(int low, int middle, int high) {

                // Copy both parts into the helper array
                for (int i = low; i <= high; i++) {
                        helper[i] = numbers[i];
                }

                int i = low;
                int j = middle + 1;
                int k = low;
                // Copy the smallest values from either the left or the right side back
                // to the original array
                while (i <= middle && j <= high) {
                        if (helper[i] <= helper[j]) {
                                numbers[k] = helper[i];
                                i++;
                        } else {
                                numbers[k] = helper[j];
                                j++;
                        }
                        k++;
                }
                // Copy the rest of the left side of the array into the target array
                while (i <= middle) {
                        numbers[k] = helper[i];
                        k++;
                        i++;
                }

        }
}