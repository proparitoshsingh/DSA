import java.util.Scanner; 
public class printStairPaths { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        getsp(n,"");
        sc.close(); 
    } 
    public static void getsp(int a,String st) {
        if(a==0){
            System.out.println(st);
            return;
        }else if(a<0){
            return;
        }
        getsp(a-1, st+"1");
        getsp(a-2, st+"2");
        getsp(a-3, st+"3");
    }
}