import java.util.*;

public class startup {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int t = scanner.nextInt();

      while (t-- > 0) {
         int n = scanner.nextInt();
         int k = scanner.nextInt();

         Map<Integer, List<Integer>> brandMap = new HashMap<>();

         for (int i = 0; i < k; i++) {
            int brand = scanner.nextInt();
            int cost = scanner.nextInt();
            brandMap.putIfAbsent(brand, new ArrayList<>());
            brandMap.get(brand).add(cost);
         }

         List<Integer> profits = new ArrayList<>();
         for (List<Integer> costs : brandMap.values()) {
            costs.sort(Collections.reverseOrder());

            int sum = 0;
            for (int cost : costs) {
               sum += cost;
            }
            profits.add(sum);
         }

         profits.sort(Collections.reverseOrder());
         int maxProfits = 0;

         for (int i = 0; i < Math.min(profits.size(), n); i++) {
            maxProfits += profits.get(i);
         }

         System.out.println(maxProfits);
      }
   }
}
