import java.io.*; 
import java.util.*; 
public class countSetBitsUpto { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        System.out.println(countSetBit(n));
        sc.close(); 
    } 
    public static int countSetBit(int n){
        if(n==0){
            return 0;
        }
        int x=maxPowerof2(n);
        int res=(x*(1<<(x-1)))+(n-(1<<x)+1)+countSetBit(n-(1<<x));
        return res;
    }
    public static int maxPowerof2(int n) {
        int x=0;
        while((1<<x)<=n){
            x++;
        }return x-1;
    }
}