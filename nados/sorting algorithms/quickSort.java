import java.util.Scanner; 
public class quickSort { 
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) 
        {
            int pi = partition(arr, arr[high],low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
      }
      public static int partition(int[] arr, int pivot, int lo, int hi) {
        System.out.println("pivot -> " + pivot);
        int i = lo, j = lo;
        while (i <= hi) {
          if (arr[i] <= pivot) {
            swap(arr, i, j);
            i++;
            j++;
          } else {
            i++;
          }
        }
        System.out.println("pivot index -> " + (j - 1));
        return (j - 1);
      }
      public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
        print(arr);
      } 
}