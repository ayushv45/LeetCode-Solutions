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
        ListNode curr = head;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        while(curr!=null)
        {
            minHeap.add(curr.val);
            curr = curr.next;
        }
        ListNode newNode = new ListNode(-1);
        ListNode newHead = newNode;
        while(!minHeap.isEmpty())
        {
            int x = minHeap.poll();
            ListNode temp = new ListNode(x);
            newNode.next = temp;
            newNode = newNode.next;
        }
        return newHead.next;
    }
}