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
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode itr=head;
        int len=0;
        while(itr!=null){
            itr=itr.next;
            len++;
        }
        for(int i=0;i<len/2;i++){
            head=head.next;
        }
        return head;
    }
}