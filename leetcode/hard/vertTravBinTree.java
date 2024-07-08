
//iterative solution

// class Tuple {
//    TreeNode node;
//    int vertical;
//    int horizontal;

//    Tuple(TreeNode node, int vertical, int horizontal) {
//       this.node = node;
//       this.vertical = vertical;
//       this.horizontal = horizontal;
//    }
// }

// class Solution {
//    public List<List<Integer>> verticalTraversal(TreeNode root) {
//       TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
//       Queue<Tuple> queue = new LinkedList<>();
//       queue.offer(new Tuple(root, 0, 0));

//       while (!queue.isEmpty()) {
//          Tuple tuple = queue.poll();
//          TreeNode node = tuple.node;
//          int vertical = tuple.vertical;
//          int horizontal = tuple.horizontal;

//          map.putIfAbsent(vertical, new TreeMap<>());
//          map.get(vertical).putIfAbsent(horizontal, new ArrayList<>());
//          map.get(vertical).get(horizontal).add(node.val);

//          if (node.left != null) {
//             queue.offer(new Tuple(node.left, vertical - 1, horizontal + 1));
//          }
//          if (node.right != null) {
//             queue.offer(new Tuple(node.right, vertical + 1, horizontal + 1));
//          }
//       }
//       List<List<Integer>> result = new ArrayList<>();

//       for (TreeMap<Integer, List<Integer>> ys : map.values()) {
//          List<Integer> verticalList = new ArrayList<>();
//          for (List<Integer> nodes : ys.values()) {
//             Collections.sort(nodes);
//             verticalList.addAll(nodes);
//          }
//          result.add(verticalList);
//       }

//       return result;
//    }
// }


//recursive solution

public class Info {
   int hd;
   int vd;
   int data;

   public Info(int hd, int vd, int data) {
      this.hd = hd;
      this.vd = vd;
      this.data = data;
   }
}

class Solution {
   List<Info> list;

   public void fun(TreeNode root, int h, int v) {
      if (root == null) {
         return;
      }
      Info info = new Info(h, v, root.val);
      list.add(info);
      fun(root.left, h - 1, v + 1);
      fun(root.right, h + 1, v + 1);
   }

   public List<List<Integer>> verticalTraversal(TreeNode root) {
      List<List<Integer>> ans = new ArrayList<>();
      list = new ArrayList<>();
      fun(root, 0, 0);
      Collections.sort(list, Comparator.comparingInt((Info info) -> info.hd)
            .thenComparingInt(info -> info.vd)
            .thenComparingInt(info -> info.data));

      int i = 0;
      while (i < list.size()) {
         ArrayList<Integer> dummy = new ArrayList<>();
         boolean inLoop = false;
         int check = list.get(i).hd;
         while (i < list.size() && list.get(i).hd == check) {
            dummy.add(list.get(i).data);
            i++;
            inLoop = true;
         }
         ans.add(new ArrayList<>(dummy));
         if (inLoop == false) {
            i++;
         }
      }

      return ans;
   }
}