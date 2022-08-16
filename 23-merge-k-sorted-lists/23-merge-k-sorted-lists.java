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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
        {
            return null;
        }
        ListNode res = lists[0];
        for(int i=1;i<lists.length;i++)
        {
            res = merge(res,lists[i]);
        }
        return res;
    }
    private ListNode merge(ListNode left,ListNode right)
    {
        if(left == null)
            return right;
        else if(right == null)
            return left;
        if(left.val <= right.val)
        {
            left.next = merge(left.next,right);
            return left;
        }
        else
            right.next = merge(left,right.next);
            return right;
    }
}