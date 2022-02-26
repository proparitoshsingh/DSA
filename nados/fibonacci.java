// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.

import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int previous=1;
        int recent=0;
        int sum=1;
        System.out.println(recent);
        if(n>1){
            System.out.println(previous);
        }
        if(n>2){
            for(int i=2;i<n;i++){
                previous=recent;
                recent=sum;
                sum=recent+previous;
                System.out.println(sum);
            }   
        }
    }
}
