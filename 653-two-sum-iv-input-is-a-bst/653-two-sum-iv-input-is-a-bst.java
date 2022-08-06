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
    boolean found = false;
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        find(root,k);
        return found;
    }
     void find(TreeNode root, int k)
     {
         if(root == null)
             return;
         if(set.contains(root.val))
         {
             found = true;
             return;
         }
         set.add(k-root.val);
         find(root.left,k);
         find(root.right,k);
     }
}