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
    public int pairSum(ListNode head) {
        if(head == null){
            return 0;
        }
        if(head.next.next == null){
            return head.val+head.next.val;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = approach(slow.next);
        
        ListNode firsthalf = head;
        int maxi = Integer.MIN_VALUE;
        while(second!=null){
            int sum = firsthalf.val + second.val;
            if(sum>maxi){
                maxi = sum;
            }
            firsthalf = firsthalf.next;
            second = second.next;
        }
        return maxi;
        
    }
    private ListNode approach(ListNode head){
        ListNode prev = null, current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
        
    }
}