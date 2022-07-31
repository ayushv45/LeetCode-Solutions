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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> newlist = new ArrayList<>();
        if(root == null)
            return newlist;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int flag = 0;
        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode curr = q.poll();
                list.add(curr.val);
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            if(flag == 0)
            {
                newlist.add(list);
                flag=1;
            }
            else
            {
                Collections.reverse(list);
                newlist.add(list);
                flag = 0;
            }
        }
        return newlist;
    }
}