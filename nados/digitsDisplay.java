// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.

import java.util.Scanner;
public class digitsDisplay {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }while(count!=0){
            int b=(int)(a/(Math.pow(10, count-1)));
            System.out.println(b%10);
            count--;
        }

        sc.close();
    }
}
