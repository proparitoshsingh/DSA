/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode itr = head;
        ListNode temp = head;
        int len = 0;
        while (itr != null) {
            itr = itr.next;
            len++;
        }
        if (n == len) {
            return head.next; 
        }
        for (int i = 0; i < len - n-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}