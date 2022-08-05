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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode pre = head;
        int i=1;
        for(i=1;i<left;i++)
        {
           pre = curr;
           curr = curr.next;
        }
        ListNode start = curr;
        while(i<=right)
        {
            ListNode temp = curr;
            curr = curr.next;
            temp.next = prev;
            prev = temp;
            i++;
        }
        start.next = curr;
        if(left == 1)
            head = prev;
        else
            pre.next = prev;
        return head;
    }
    
}