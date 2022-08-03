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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,root));
        int width = 0;
        while(!q.isEmpty())
        {
            int n = q.size();
            int min = q.peek().index;
            int f_index = 0,l_index = 0;
            for(int i=0;i<n;i++)
            {
                int curr_id = q.peek().index-min;
                Pair curr = q.poll();
                if(i==0)
                    f_index = curr_id;
                if(i==n-1)
                    l_index = curr_id;
                if(curr.node.left !=null)
                {
                    q.add(new Pair(curr_id*2+1 , curr.node.left));
                }
                if(curr.node.right !=null)
                {
                    q.add(new Pair(curr_id*2+2 , curr.node.right));
                }
            }
            width = Math.max(width,l_index-f_index+1);
        }
        return width;
    }
    class Pair{
        int index;
        TreeNode node;
        public Pair(int index, TreeNode node)
        {
            this.index = index;
            this.node = node;
        }
    }
}