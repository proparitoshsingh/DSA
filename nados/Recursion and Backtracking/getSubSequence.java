import java.util.ArrayList;
import java.util.Scanner; 
public class getSubSequence { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String str=sc.next();
        ArrayList<String> arr=getsseq(str);
        System.out.println(arr);
        
        sc.close(); 
    } 
    public static ArrayList<String> getsseq(String st) {
        if(st.length()==0){
            ArrayList<String> ntarr=new ArrayList<>();
            ntarr.add("");
            return ntarr;
        }
        char tch=st.charAt(0);
        String res=st.substring(1);
        ArrayList<String> tarr=getsseq(res);
        ArrayList<String> farr=new ArrayList<>();
        for(String el:tarr){
            farr.add(""+el);
        }for(String el:tarr){
            farr.add(tch+el);
        }
        return farr;
    }
}