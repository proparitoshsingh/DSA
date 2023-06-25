// class Solution {
//     public void sortColors(int[] nums) {
//         int zeros=0;
//         int ones=0;
//         int twos=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//                 zeros++;
//             }
//             else if(nums[i]==1){
//                 ones++;
//             }
//             else if(nums[i]==2){
//                 twos++;
//             }
//         }int i=0;
//         while(zeros>0){
//             nums[i]=0;
//             i++;
//             zeros--;
//         }
//         while(ones>0){
//             nums[i]=1;
//             i++;
//             ones--;
//         }
//         while(twos>0){
//             nums[i]=2;
//             i++;
//             twos--;
//         }
//     }
// }
//Modified approach using Dutch national flag algorithm
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int temp=0;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
}