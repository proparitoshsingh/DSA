import java.util.Scanner; 
public class factorial { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        System.out.println(fact(n));
        sc.close(); 
    } 
    public static int fact(int a){
        if(a==0){
            return 1;
        }
        int fact=a*fact(a-1);
        return fact;
    }
}