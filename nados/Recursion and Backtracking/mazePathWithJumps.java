import java.util.ArrayList;
import java.util.Scanner; 
public class mazePathWithJumps { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int r=sc.nextInt(); 
        int c=sc.nextInt(); 
        ArrayList<String> st=getmpwj(1,1,r,c);
        System.out.println(st);
        sc.close(); 
    } 
    public static ArrayList<String> getmpwj(int sr,int sc, int dr,int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> fst=new ArrayList<>();
            fst.add("");
            return fst;
        }
        ArrayList<String> fstr=new ArrayList<>();
        for(int i=1;i<=dc-sc;i++){
            ArrayList<String> thstr=getmpwj(sr, sc+i, dr, dc);
            for(String temp:thstr){
                fstr.add("h"+i+temp);
            }
        }for(int i=1;i<=dr-sr;i++){
            ArrayList<String> tvstr=getmpwj(sr+i, sc, dr, dc);
            for(String temp:tvstr){
                fstr.add("v"+i+temp);
            }
        }for(int i=1;i<=dc-sc && i<=dr-sr;i++){
            ArrayList<String> tdstr=getmpwj(sr+i, sc+i, dr, dc);
            for(String temp:tdstr){
                fstr.add("d"+i+temp);
            }
        }return fstr;
    }
}