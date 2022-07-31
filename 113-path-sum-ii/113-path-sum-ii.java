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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return ans;
        sum(root,targetSum,list);
        return ans;
    }
    void sum(TreeNode root, int targetSum, List<Integer> list)
    {
        if(root == null)
            return;
        
        list.add(root.val);
        if(root.left == null && root.right == null && targetSum == root.val)
        {
            ans.add(new ArrayList<>(list));
        }
        sum(root.left,targetSum-root.val,list);
        sum(root.right,targetSum-root.val,list);     
        list.remove(list.size()-1);
    }
}