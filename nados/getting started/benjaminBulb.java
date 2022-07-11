import java.util.Scanner; 
public class benjaminBulb { 
   public static void main(String args[]) { 
      Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt(); 
      bulbSwitch(n);
   }
   public static int bulbSwitch(int n) {
      if(n==1){
          return n;
      }
      int count=0;
      for(int i=1;i*i<=n;i++){
          count++;
      }
      return count;
  }
}