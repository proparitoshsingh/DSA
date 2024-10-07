class Solution {
    private void findSubs(int[] nums, int idx, List<Integer> curr, List<List<Integer>> res){
        res.add(new ArrayList<>(curr));
        for(int i=idx; i<nums.length;i++){
            if(i!= idx && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            findSubs(nums, i+1, curr, res);
            curr.remove(curr.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums); 
        findSubs(nums, 0,new ArrayList<>(), res);
        return res;
    }
}