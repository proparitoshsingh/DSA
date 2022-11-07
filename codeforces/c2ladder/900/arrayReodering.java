import java.io.*;
import java.time.Year;
import java.util.*; 
public class arrayReodering { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            int count=0;
            int ecount=1;
            for(int j=0;j<n;j++){
                int temp=sc.nextInt();
                if(temp%2==0){
                    count=count+(n-ecount);
                    ecount++;
                }else{
                    a.add(temp);
                }
            }
            for(int j=0;j<n-ecount-1;j++){
                for(int z=j+1;z<n-ecount;z++){
                    if(gcdeval(a.get(j), 2*(a.get(z)))){
                        count++;
                    }
                }
            }System.out.println(count);
        }
        sc.close(); 
    }public static boolean gcdeval(int x,int y) {
        int temp=Math.min(x, y);
        x=Math.max(x, y);
        y=temp;
        if(x%y==0 && y>1){
            return true;
        }else{
            int r=0;
            while(x%y!=0){
                r=x%y;
                x=y;
                y=r;
            }if(r>1){
                return true;
            }
        }return false;
    } 
}