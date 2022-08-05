import java.util.Scanner; 
public class selectionSort { 
    public static void selectionSort(int[] arr) {
        int n = arr.length;
            for (int i = 0; i < n-1; i++)
            {
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (isSmaller(arr,j,min_idx))
                        min_idx = j;
      
                swap(arr,min_idx,i);
            }
        
      }
      public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[j] + " and " + arr[i]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
          return true;
        } else {
          return false;
        }
      }
    
      public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
        }
      }
    
      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        selectionSort(arr);
        print(arr);
      } 
}