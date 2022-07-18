import java.util.Scanner; 
public class printIncrDecr { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        decr(n);
        sc.close(); 
    } 
    public static void decr(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        decr(a-1);
        System.out.println(a);
    }
}