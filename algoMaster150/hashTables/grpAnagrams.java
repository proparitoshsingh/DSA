//https://leetcode.com/problems/group-anagrams/


// Counting Characters approach
// class Solution {
//    public List<List<String>> groupAnagrams(String[] strs) {
//       Map<String, List<String>> anagramMap = new HashMap<>();

//       for (String word : strs) {
//          int[] charCount = new int[26];

//          for (char c : word.toCharArray()) {
//             charCount[c - 'a']++;
//          }

//          StringBuilder keyBuilder = new StringBuilder();
//          for (int count : charCount) {
//             keyBuilder.append('#');
//             keyBuilder.append(count);
//          }
//          String key = keyBuilder.toString();

//          if (!anagramMap.containsKey(key)) {
//             anagramMap.put(key, new ArrayList<>());
//          }
//          anagramMap.get(key).add(word);
//       }

//       return new ArrayList<>(anagramMap.values());
//    }
// }


// hashmap approach
class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> res = new ArrayList<>();
      HashMap<String, List<String>> map = new HashMap<>();

      for (int i = 0; i < strs.length; i++) {
         char[] temp = strs[i].toCharArray();
         Arrays.sort(temp);
         String str = new String(temp);

         if (!map.containsKey(str)) map.put(str, new ArrayList<>());
         map.get(str).add(strs[i]);
      }

      for (List<String> val : map.values()) {
         res.add(val);
      }

      return res;
   }
}