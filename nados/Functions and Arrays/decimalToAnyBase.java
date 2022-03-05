import java.util.Scanner; 
public class decimalToAnyBase { 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
    }  
    public static int getValueInBase(int n, int b){
        // write code here
        int a,num=0;
        int c=0;
        while(n>=1){
            a=(int)((n%b)*Math.pow(10, c));
            num=num+a;
            n=n/b;
            c++;
        }
        return num;
    }
}