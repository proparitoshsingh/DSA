// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.

import java.util.Scanner;

public class reverseNum {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            System.out.println(n%10);
            n=n/10;
        }
        sc.close();

    }
}
