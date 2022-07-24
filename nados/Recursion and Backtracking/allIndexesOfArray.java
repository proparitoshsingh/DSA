// 1. You are given a number n, representing the count of elements. 

// 2. You are given n numbers.

// 3. You are given a number x. 

// 4. You are required to return the all indices at which x occurs in array a. 

// 5. Return an array of appropriate size which contains all indices at which x occurs in array 

// 6. If no such element exist print "NO OUTPUT" a. 

import java.io.*;
import java.util.*;
public class allIndexesOfArray { 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println("NO OUTPUT");
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }
    public static int[] allIndices(int[] arr, int x, int ind, int fsf) {
        // write ur code here
        if(ind==arr.length){
            return new int[fsf];
        }
        if(arr[ind]==x){
            int[] a=allIndices(arr, x, ind+1, fsf+1);
            a[fsf]=ind;
            return a;
        }else{
            int[] a=allIndices(arr, x, ind+1, fsf);
            return a;
        }
        
    }   
 
}