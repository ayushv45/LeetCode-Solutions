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
    public ListNode partition(ListNode head, int x) {
        ListNode curr = head;
        ListNode lesser = new ListNode(0);
        ListNode templesser = lesser;
        ListNode greater = new ListNode(0);
        ListNode tempgreater = greater;
        while(curr!=null)
        {
            if(curr.val < x)
            {
                templesser.next = new ListNode(curr.val);
                templesser = templesser.next;
            }
            else{
                tempgreater.next =  new ListNode(curr.val);
                tempgreater = tempgreater.next;
            }
            curr = curr.next;
        }
        templesser.next = greater.next;
        return lesser.next;
    }
}