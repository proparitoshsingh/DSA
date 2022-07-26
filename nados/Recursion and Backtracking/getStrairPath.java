// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
import java.util.ArrayList;
import java.util.Scanner; 
public class getStrairPath { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        ArrayList<String> st=getsp(n);
        System.out.println(st);
        sc.close(); 
    } 
    public static ArrayList<String> getsp(int a) {
        if(a==0){
            ArrayList<String> bstr=new ArrayList<>();
            bstr.add("");
            return bstr;
        }else if(a<0){
            ArrayList<String> bstr=new ArrayList<>();
            return bstr;
        }
        ArrayList<String> ostr=getsp(a-1);
        ArrayList<String> sstr=getsp(a-2);
        ArrayList<String> tstr=getsp(a-3);
        ArrayList<String> fstr=new ArrayList<>();
        for(String p:ostr){
            fstr.add("1"+p);
        }for(String p:sstr){
            fstr.add("2"+p);
        }for(String p:tstr){
            fstr.add("3"+p);
        }return fstr;
    }
}