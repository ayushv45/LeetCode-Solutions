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
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return 0;
        int[] arr = new int[1];
        arr[0]=k;
        traverse(root,arr);
        return ans;
    }
    void traverse(TreeNode root ,int[] arr)
    {
        if(root == null)
            return;
        traverse(root.left,arr);
        arr[0]--;
        if(arr[0]==0)
        {
          ans = root.val;
            return;
        } 
        traverse(root.right,arr);
    }
}