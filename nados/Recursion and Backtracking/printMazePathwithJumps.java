import java.util.Scanner; 
public class printMazePathwithJumps { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int r=sc.nextInt(); 
        int c=sc.nextInt(); 
        getmpwj(1,1,r,c,"");
        sc.close(); 
    } 
    public static void getmpwj(int sr,int sc,int dr,int dc,String ans) {
        
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }else if(sc>dc || sr>dr){
            return;
        }
        for(int i=1;i<=dc-sc;i++){
            getmpwj(sr, sc+i, dr, dc, ans+"h"+i);
        }for(int i=1;i<=dr-sr;i++){
            getmpwj(sr+i, sc, dr, dc, ans+"v"+i);
        }for(int i=1;i<=dr-sr;i++){
            getmpwj(sr+i, sc+i, dr, dc, ans+"d"+i);
        }
    }
}