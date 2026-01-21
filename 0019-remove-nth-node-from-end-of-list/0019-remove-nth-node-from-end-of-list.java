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
        if(head == null){
            return head;
        }
        ListNode temp = head;
        ListNode slow = temp;
        ListNode fast = temp;
        int count = 0;
        while(temp != null && count!=n){
            fast = fast.next;
            count++;
            

        }
        if(fast == null){
            return slow.next;
        }
       
        while(fast != null){
            fast = fast.next;
            if(fast == null){
                slow.next = slow.next.next;
                break;
            }
            else{
                slow = slow.next;
            }

        }
        return temp;
        
    }
}