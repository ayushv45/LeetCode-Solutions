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
    int rem;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return 0;
        rem =k;
        return traverse(root);
    }
    int traverse(TreeNode root)
    {
        if(root == null)
            return -1;
        int ans = traverse(root.left);
        if(ans!=-1)
        {
            return ans;
        } 
        rem--;
        if(rem == 0)
            return root.val;
        return traverse(root.right);
    }
}