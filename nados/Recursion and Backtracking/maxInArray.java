import java.util.Scanner; 
public class maxInArray { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxele(arr,0));
        sc.close(); 
    } 
    public static int maxele(int[] a,int b) {
        if(b==a.length){
            System.out.println("*"));
            return a[b-1];
        }
        int tmax=maxele(a,b+1);
        int fmax=a[b];
        if(tmax>fmax){
            fmax=tmax;
        }
        return fmax;
    }
}