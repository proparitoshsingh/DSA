import java.io.*; 
import java.util.*; 
public class beautySubstring { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String s=sc.next(); 
        System.out.println(sumbeachi(s));
        sc.close(); 
    } 
    public static int isBeauchi(String str) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }int fmax=Collections.max(map.values());
        int fmin=Collections.min(map.values());
        return fmax-fmin;
    }
    public static int sumbeachi(String str) {
        int sum=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String sub=str.substring(i, j+1);
                sum+=isBeauchi(sub);
            }
        }return sum;
    }
}