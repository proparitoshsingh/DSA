// Definition for singly-linked list.
// #[derive(PartialEq, Eq, Clone, Debug)]
// pub struct ListNode {
//   pub val: i32,
//   pub next: Option<Box<ListNode>>
// }
// 
// impl ListNode {
//   #[inline]
//   fn new(val: i32) -> Self {
//     ListNode {
//       next: None,
//       val
//     }
//   }
// }
impl Solution {
    pub fn is_palindrome(head: Option<Box<ListNode>>) -> bool {
        let mut arr = Vec::new();
        let mut current = &head;
        while let Some(node) = current {
            arr.push(node.val);
            current = &node.next;
        }
        let mut left = 0;
        let mut right = arr.len() - 1;
        while left < right {
            if arr[left] != arr[right] {
                return false;
            }
            left += 1;
            right -= 1;
        }
        
        true
    }
}