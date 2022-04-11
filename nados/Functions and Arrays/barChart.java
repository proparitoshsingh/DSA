import java.util.Scanner; 
public class barChart { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt(); 
        int[] arr=new int[n];
        int max=arr[0];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            arr[i]=a;
            if(i==0){
                max=arr[i];
            }if(i!=0 && (arr[i]>max)){
                max=arr[i];
            }
        }for(int i=0;i<arr.length;i++){
            arr[i]-=max;
        }for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        for(int i=0;i<max;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>=0){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }System.out.println();
            for(int k=0;k<arr.length;k++){
                arr[k]+=1;
            }
        }
        sc.close(); 
    } 
}