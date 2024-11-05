class Solution {
    public String compressedString(String word) {
        String str = "";
        int i = 0;
        int n = word.length();

        while (i < n) {
            char curr = word.charAt(i);
            int count = 0;
            while (i < n && word.charAt(i) == curr && count < 9) {
                count++;
                i++;
            }
            str= str + count + curr;
        }

        return str;
    }
}