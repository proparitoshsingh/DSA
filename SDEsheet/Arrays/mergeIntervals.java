class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); 
        List<int[]> res = new ArrayList<>();
        int[] temp = intervals[0];
        for (int[] interval : intervals) {
            if (interval[0] <= temp[1]) {
                temp[1] = Math.max(temp[1], interval[1]);
            } else {
                res.add(temp);
                temp = interval;
            }
        }
        res.add(temp);
        return res.toArray(new int[res.size()][]);
    }
}