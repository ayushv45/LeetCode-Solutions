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
        ListNode curr = head;
        int size = 0;
        while(curr!=null)
        {
            size++;
            curr = curr.next;
        }
        curr = head;
        ListNode prev = curr;
        int i=1;
        while(curr!=null)
        {
            if(size == n)
            {
                head = curr.next;
                break;
            }
            if(i == size-n+1)
            {
                prev.next = curr.next;
                break;
            }
            i++;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}