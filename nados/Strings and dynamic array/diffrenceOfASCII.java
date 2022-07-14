// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//    For "abecd", the answer should be "a1b3e-2c1d", as 
//    'b'-'a' = 1
//    'e'-'b' = 3
//    'c'-'e' = -2
//    'd'-'c' = 1

import java.util.Scanner; 
public class diffrenceOfASCII { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String st=sc.next();
        StringBuilder sb=new StringBuilder(Character.toString(st.charAt(0)));
        for(int i=1;i<st.length();i++){
            int val=st.charAt(i)-st.charAt(i-1);
            sb.append(Integer.toString(val));
            sb.append(st.charAt(i));
        }System.out.println(sb);
        sc.close(); 
    } 
}