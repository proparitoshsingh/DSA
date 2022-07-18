import java.util.Scanner; 
public class printIncreasing { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        incr(n);
        sc.close(); 
    } 
    public static void incr(int a){
        if(a==0){
            return;
        }
        incr(a-1);
        System.out.println(a);
    }
}