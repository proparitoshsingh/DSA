import java.util.Scanner; 
public class powerLinear { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int x=sc.nextInt(); 
        int n=sc.nextInt();
        System.out.println(power(x,n));
        sc.close(); 
    } 
    public static int power(int a,int b) {
        if(b==0){
            return 1;
        }int exp=a*power(a, b-1);
        return exp;
    }
}