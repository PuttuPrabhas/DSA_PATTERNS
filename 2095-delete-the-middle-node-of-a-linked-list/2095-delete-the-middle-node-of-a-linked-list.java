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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null){
            if(fast.next == null || fast.next.next == null){
                slow.next = slow.next.next;
                return head;

            }
           
            
            fast = fast.next.next;
            if(fast.next == null){
                slow.next = slow.next.next;
                return head;
            }
            slow = slow.next;
            
        }
        return head;
       
    }
}