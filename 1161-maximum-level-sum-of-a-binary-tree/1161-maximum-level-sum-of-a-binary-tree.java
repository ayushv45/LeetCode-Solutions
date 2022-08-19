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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level =0;
        int maxsumlevel = 0;
        int max = Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
            int n = q.size();
            int sum = 0;
            level++;
            for(int i=0;i<n;i++)
            {
                TreeNode curr = q.poll();
                sum += curr.val;
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(sum>max)
            {
                max = sum;
                maxsumlevel = level;
            }
        }
        return maxsumlevel;
    }
}