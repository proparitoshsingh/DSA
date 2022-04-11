import java.util.Scanner; 
public class sumOfArrays { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n1=sc.nextInt(); 
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            int a=sc.nextInt();
            arr1[i]=a;
        }int n2=sc.nextInt(); 
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            int a=sc.nextInt();
            arr2[i]=a;
        }int diff=0;
        int[] len={};
        int[] nlen={};
        if(arr1.length>arr2.length){
            diff=arr1.length-arr2.length;
            len=arr1;
            nlen=arr2;
        }else{
            diff=arr2.length-arr1.length;
            len=arr2;
            nlen=arr1;
        }int forward=0;
        for(int i=0;i<len.length;i++){
            if(i<diff){
                System.out.println(len[i]);
                forward++;
            }else{
                System.out.println(len[i]+nlen[i-forward]);
            }
        }
        sc.close(); 
    } 
}