import java.util.Scanner; 
public class powerLogarithmic { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int x=sc.nextInt();
        int n=sc.nextInt(); 
        System.out.println(powlog(x,n));;
        sc.close(); 
    } 
    public static int powlog(int a,int b) {
        if(b==0){
            return 1;
        }
        int tres=powlog(a, b/2);
        int res=tres*tres;
        if(b%2!=0){
            res=res*a;
        }
        return res;
    }
}