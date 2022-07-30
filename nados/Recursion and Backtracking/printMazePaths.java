import java.util.Scanner; 
public class printMazePaths { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int r=sc.nextInt(); 
        int c=sc.nextInt(); 
        getmp(1,1,r,c,"");
        sc.close(); 
    }
    public static void getmp(int sr,int sc,int dr,int dc,String ans) {
        
        if(sc==dc && sr==dr){
            System.out.println(ans);
            return;
        }if(sc>dc || sr>dr){
            return;
        }
        getmp(sr, sc+1, dr, dc,ans+"h");
        getmp(sr+1, sc, dr, dc,ans+"v");
    }
}