import java.io.*; 
import java.util.*; 
public class ArithmaticArray { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }goodArray(a);
        }
    } public static void goodArray(int a[]) {
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }if(sum<a.length){
            System.out.println(1);
            return;
        }else{
            System.out.println(sum-a.length);
        }
    }
}