import java.util.Scanner; 
public class stringCompression { 

    public static String compression1(String str){
        String comp="";
        comp=comp+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)!=str.charAt(i)){
                comp=comp+str.charAt(i);
            }
        }
		return comp;
	}

	public static String compression2(String str){
        String comp="";
        int count=1;
        comp=comp+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==str.charAt(i)){
                count++;
            }else {
                if(count==1){
                    comp=comp+str.charAt(i);
                }else{
                    comp=comp+count+str.charAt(i);
                }count=1;
            }if(i==str.length()-1){
                if(count>1){
                    comp=comp+(count);
                }
            }
        }
		return comp;
	}
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        String str=sc.next(); 
        System.out.println(compression1(str));
		System.out.println(compression2(str));
        sc.close(); 
    } 
}