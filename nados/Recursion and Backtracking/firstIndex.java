import java.util.Scanner; 
public class firstIndex { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int x=sc.nextInt();
        System.out.println(firstind(arr,x,0));;
        sc.close(); 
    } 
    public static int firstind(int[] a ,int b,int c) {
        if(c==a.length){
            return -1;
        }int tres=a[c];
        if(tres==b){
            return c;
        }
        int fres=firstind(a, b, c+1);
        return fres;
    }

}