import java.util.Scanner; 
public class differenceOfArrays { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int n1=sc.nextInt(); 
        int b1=n1;
        int num1=0;int num2=0;
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            int a=sc.nextInt();
            arr1[i]=a;
            num1=num1+(a*(int)Math.pow(10, b1-1));
            b1--;
        }int n2=sc.nextInt();
        int b2=n2; 
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            int a=sc.nextInt();
            arr2[i]=a;
            num2=num2+(a*(int)Math.pow(10, b2-1));
            b2--;
        }int diff=num1-num2;
        if(diff<0){
            diff=diff*(-1);
        }int a=diff;
        int count=0;
        while(a!=0){
            a=a/10;
            count++;
        }
        while(diff!=0){
            int res=diff/((int)Math.pow(10, count-1));
            System.out.println(res);
            diff=diff-(res*((int)Math.pow(10, count-1)));
            count--;
        }
        sc.close(); 
    } 
}