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
    public TreeNode deleteNode(TreeNode root, int val) {
        if(root == null)
            return null;
        
        if(root.val == val)
            return helper(root);
        
        TreeNode curr = root;
        while(curr!=null)
        {
            if(val > curr.val)
            {
                if(curr.right!=null && curr.right.val == val)
                {
                    curr.right = helper(curr.right);
                    break;
                }
                else
                curr = curr.right;
            }
            else{
                if(curr.left!=null && curr.left.val == val)
                {
                    curr.left = helper(curr.left);
                    break;
                }
                else
                curr = curr.left;
            }
        }
         return root;
      }
    private TreeNode helper(TreeNode root)
    {
        if(root.left == null)
            return root.right;
        
        else if (root.right == null)
            return root.left;
        
        else{
            TreeNode curr = findright(root.left);
            curr.right = root.right;
            return root.left;
        }
    }
    TreeNode findright(TreeNode root)
    {
        if(root.right == null)
            return root;
        
        return findright(root.right);
    }
}