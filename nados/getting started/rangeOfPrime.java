// 1. You've to print all prime numbers between a range. 
// 2. Take as input "low", the lower limit of range.
// 3. Take as input "high", the higher limit of range.
// 4. For the range print all the primes numbers between low and high (both included).

import java.util.Scanner;

public class rangeOfPrime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        
        for(int i=low;i<=high;i++){
            if(i==2){
                System.out.println(i);
                continue;
            }else if(i%2==0){
                continue;
            }
            int count=0;
            for(int j=3;j*j<=i;j+=2){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}