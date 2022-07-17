// https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/

import java.util.Scanner; 
public class problem2231 { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        StringBuilder sb=new StringBuilder(n+"");
        int max=0;
        for(int i=0;i<sb.length();i++){
            char cur=sb.charAt(i);
            if(isEven(cur)){
                max=maxEven(sb, i);
            }else{
                max=maxOdd(sb,i);
            }char temp=sb.charAt(max);
            sb.setCharAt(max, cur);
            sb.setCharAt(i, temp);
        }System.out.println(Integer.parseInt(sb.toString()));
        sc.close(); 
    } 

    public static int maxEven(StringBuilder sb,int idx){
        int max=idx;
        for(int j=idx+1;j<sb.length();j++){
            char cur=sb.charAt(j);
            if(isEven(cur) && cur>sb.charAt(max)){
                max=j;
            }
        }return max;
    }
    public static int maxOdd(StringBuilder sb,int idx){
        int max=idx;
        for(int j=idx+1;j<sb.length();j++){
            char cur=sb.charAt(j);
            if(!(isEven(cur)) && cur>sb.charAt(max)){
                max=j;
            }
        }return max;
    }
    public static boolean isEven(char ch){
        int chi=(int)ch;
        if(chi%2==0){
            return true;
        }return false;
    }
}