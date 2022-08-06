/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        traverse(root,minHeap);
        while(k>1)
        {
            minHeap.poll();
            k--;
        }
        return minHeap.peek();
    }
    void traverse(TreeNode root,  PriorityQueue<Integer> minHeap )
    {
        if(root == null)
            return;
        minHeap.add(root.val);
        traverse(root.left,minHeap);
        traverse(root.right,minHeap);
    }
}