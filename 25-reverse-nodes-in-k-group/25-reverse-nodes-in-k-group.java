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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int size =0;
        while(curr!=null)
        {
            curr = curr.next;
            size++;
        }
        curr = head;
        ListNode prev = null;
        return reverse(curr,prev, k, size);
        
    }
    ListNode reverse(ListNode curr,ListNode prev, int k , int size)
    {
        if(size<k)
        {
            return curr;
        }
        int t = k;
        ListNode start = curr;
        while(t>0)
        {
            ListNode temp = curr;
            curr = curr.next;
            temp.next = prev;
            prev = temp;
            t--;
        }
        start.next = reverse(curr,null,k,size-k);
        return prev;
    }
    
}