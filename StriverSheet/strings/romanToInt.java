import java.io.*; 
import java.util.*; 
public class romanToInt { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String n=sc.next(); 
        System.out.println(toInt(n));
        sc.close(); 
    } 
    public static int toInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(flag){
                flag=false;
                continue;
            }char ch=s.charAt(i);
            if(i==s.length()-1){
                res=res+map.get(ch);
                return res;
            }
            char cht=s.charAt(i+1);
            int temp=map.get(cht)-map.get(ch);
            if(temp>0){
                res=res+temp;
                flag=true;
            }else{
                res=res+map.get(ch);
            }
        }return res;

    }
}