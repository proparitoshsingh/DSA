import java.io.*; 
import java.util.*; 
public class fairPlayoff { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        for(int i=0;i<t;i++){
            int a[]=new int[4];
            for(int j=0;j<4;j++){
                a[j]=sc.nextInt();
            }fairPlay(a);
        }
    }
    public static void fairPlay(int a[]){
        int m1=a[0],m2=a[1];
        int id1=0,id2=1;
        for(int i=1;i<4;i++){
            if(a[i]>m1){
                m2=m1;
                id2=id1;
                m1=a[i];
                id1=i;
            }else{
                if(a[i]>m2){
                    m2=a[i];
                    id2=i;
                }
            }
        }System.out.println(id1+" - "+id2);
        if((id1==id2+1 || id2==id1+1)){
            if((id1==1 && id2==2)||(id2==1 && id1==2)){
                System.out.println("YES");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("Yes");
        }

    }
}