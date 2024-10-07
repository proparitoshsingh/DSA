class Solution {
    private void findSubsetSums(ArrayList<Integer> arr, int idx, int currSum, ArrayList<Integer> res){
            if(idx == arr.size()){
                res.add(currSum);
                return;
            }
            findSubsetSums(arr, idx+1, currSum, res);
            findSubsetSums(arr, idx+1, currSum+arr.get(idx), res);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> res=new ArrayList<>();
        findSubsetSums(arr,0,0,res);
        return res;
    }
}