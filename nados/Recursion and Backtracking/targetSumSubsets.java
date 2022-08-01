import java.util.Scanner; 
public class targetSumSubsets { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int tar=sc.nextInt();
        targetss(arr,tar,0,0,"");
        sc.close(); 
    } 
    public static void targetss(int[] arr,int tar,int sum,int ind,String ans) {
        if(sum==tar){
            System.out.println(ans+".");
            return;
        }if(ind==arr.length){
            return;
        }
        int ele=arr[ind];
        targetss(arr, tar, sum+ele, ind+1, ans+ele+", ");
        targetss(arr, tar, sum, ind+1, ans);

    }
}