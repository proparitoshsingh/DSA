import java.io.*; 
import java.util.*; 
public class powerOfTwo { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        System.out.println(powerOf2(n));
        sc.close(); 
    } 
    public static boolean powerOf2(int n){
        if(n==0 || n==Integer.MAX_VALUE || n==Integer.MIN_VALUE)
        return false;
        return ((n&(n-1))==0);
    }
}