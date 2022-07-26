// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
// 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.

import java.util.ArrayList;
import java.util.Scanner; 
public class getMazePath { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int r=sc.nextInt(); 
        int c=sc.nextInt();
        ArrayList<String> st=getmp(1, 1, r, c);
        System.out.println(st);
        sc.close(); 
    } 
    public static ArrayList<String> getmp(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> res=new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> thst=new ArrayList<>();
        ArrayList<String> tvst=new ArrayList<>();
        if(sc<dc){
            thst=getmp(sr, sc+1, dr, dc);
        }if(sr<dr){
            tvst=getmp(sr+1, sc, dr, dc);
        }
        ArrayList<String> fst=new ArrayList<>();
        for(String temp:thst){
            fst.add("h"+temp);
        }for(String temp:tvst){
            fst.add("v"+temp);
        }
        return fst;
    }
}