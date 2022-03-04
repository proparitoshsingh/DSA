// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

import java.util.Scanner;
public class primeCheck{
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t =scn.nextInt();
        int inp[]=new int[t];
        for(int i=0;i<t;i++){
            int n=scn.nextInt();
            inp[i]=n;
        }scn.close();
        for(int i=0;i<t;i++){
            int n=inp[i];
            if(n==2){
                System.out.println("prime");
                continue;
            }else if(n==1 || n%2==0){
                System.out.println("not prime");
                continue;
            }
            int mid=n/2;
            int count=0;
            for(int j=3;j<=mid+1;j+=2){
                if(n%j==0){
                    count++;
                    continue;
                }
            }if(count==0){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    }
}