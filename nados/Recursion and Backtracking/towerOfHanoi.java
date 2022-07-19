import java.util.Scanner; 
public class towerOfHanoi { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int src=sc.nextInt();
        int dest=sc.nextInt();
        int help=sc.nextInt();
        hanoi(n, src, dest, help);
        sc.close(); 
    } 
    public static void hanoi(int n,int src,int dest, int help){
        if(n==0){
            return;
        }
        hanoi(n-1, src, help, dest);
        System.out.println(n+"["+src+" -> "+dest+"]");
        hanoi(n-1, help, dest, src);
    } 
}