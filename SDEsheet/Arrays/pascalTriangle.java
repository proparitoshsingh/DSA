class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> prev=null,now=null;
        for(int i=0;i<numRows;i++){
            now=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    now.add(1);
                }else{
                    now.add(prev.get(j)+prev.get(j-1));
                }
            }prev=now;
            res.add(now);
        }return res;
    }
}