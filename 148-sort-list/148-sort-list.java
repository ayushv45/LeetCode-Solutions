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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while(fast!=null && fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left,right);
    }
    private static ListNode merge(ListNode left,ListNode right)
    {
        ListNode tempNode1 =left;
        ListNode tempNode2 = right;
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while(tempNode1!=null && tempNode2!=null)
        {
            if(tempNode1.val<=tempNode2.val)
            {
                dummy.next = tempNode1;
                tempNode1 = tempNode1.next;
            }
            else{
                dummy.next = tempNode2;
                tempNode2 = tempNode2.next;
            }
            dummy = dummy.next;
        }
        while(tempNode1!=null)
        {
            dummy.next = tempNode1;
            dummy = dummy.next;
            tempNode1 = tempNode1.next;
        }
        while(tempNode2!=null)
        {
             dummy.next = tempNode2;
            dummy = dummy.next;
            tempNode2 = tempNode2.next;
        }
        return head.next;
    }
}