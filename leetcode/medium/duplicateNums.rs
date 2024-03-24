//https://leetcode.com/problems/find-the-duplicate-number/description/?envType=daily-question&envId=2024-03-24

impl Solution {
    pub fn find_duplicate(nums: Vec<i32>) -> i32 {
        let mut a = nums[0];
        let mut b = nums[0];
        loop {
            a = nums[a as usize];
            b = nums[nums[b as usize] as usize];
            if a == b {
                break;
            }
        }
        let mut p1 = nums[0];
        let mut p2 = a;
        while p1 != p2 {
            p1 = nums[p1 as usize];
            p2 = nums[p2 as usize];
        }
        p1
    }
}
