// 1. Here are a few sets of inputs and outputs for your reference
// Input1 -> 1
// Output1 -> 1 1 1

// Input2 -> 2
// Output2 -> 2 1 1 1 2 1 1 1 2

// Input2 -> 3
// Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3

// 2. Figure out the pattern and complete the recursive function pzz to achieve the above for any positive number n.

import java.util.Scanner; 
public class printZigzag { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        jigjag(n);
        sc.close(); 
    } 
    public static void jigjag(int a) {
        if(a==0){
            return;
        }
        System.out.print(a+" ");
        jigjag(a-1);
        System.out.print(a+" ");
        jigjag(a-1);
        System.out.print(a+" ");
    }
}