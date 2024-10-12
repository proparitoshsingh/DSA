class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int t=m+n;
        int m1=(t-1)/2;
        int m2=t/2;
        int i, j=0;
        int curr, prev=0;
        for(int c=0;c<=m2;c++){
            prev=curr;
            if(i<m &&(j>=n || nums1[i]<= nums2[j])){
                curr=nums1[i++];
            }else{
                curr=nums2[j++];
            }
        }
        if(t%2==1) return curr;
        return (prev+curr)/2;
    }
}