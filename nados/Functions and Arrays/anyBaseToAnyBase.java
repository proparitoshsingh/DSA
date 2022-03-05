import java.util.Scanner; 
public class anyBaseToAnyBase { 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int res=b2b(n, sourceBase,destBase);
        System.out.println(res);
        scn.close();
     }
     public static int b2b(int n, int b1, int b2 ){
        // write your code here
        int a,num=0;
        int fnum=0;
        int c=0;
        while(n>=1){
            a=(int)((n%10)*Math.pow(b1, c));
            num=num+a;
            c++;
            n=n/10;
        }c=0;
        while(num>=1){
            a=(int)((num%b2)*Math.pow(10, c));
            fnum=fnum+a;
            num=num/b2;
            c++;
        }
        return fnum;
     } 
}