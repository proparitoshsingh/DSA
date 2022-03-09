import java.util.Scanner; 
public class spanOfArray { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            arr[i]=a;
            if(i==0){
                max=arr[i];min=arr[i];
            }
            if(i!=0 && (arr[i]>max)){
                max=arr[i];
            }else if(i!=0 && (arr[i]<min)){
                min=arr[i];
            }
        }System.out.println(max-min);
        sc.close();
    }
}