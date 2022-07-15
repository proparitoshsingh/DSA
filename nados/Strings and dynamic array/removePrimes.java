import java.util.ArrayList;
import java.util.Scanner; 
public class removePrimes { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        ArrayList<Integer> lst=new ArrayList<Integer>();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            lst.add(a);
        }
        for(int i=0;i<lst.size();i++){
            int n=lst.get(i);
            if(n==2){
                lst.remove(i);
                continue;
            }
            int mid=n/2;
            int count=0;
            for(int j=3;j<=mid+1;j+=2){
                if(n%j==0){
                    count++;
                    continue;
                }
            }if(count==0){
                lst.remove(i);
            }
        }
        System.out.println(lst);
        sc.close(); 
    } 
}