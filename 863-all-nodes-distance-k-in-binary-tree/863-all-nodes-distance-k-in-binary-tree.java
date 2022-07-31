/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list = new LinkedList<>();
        if(root == null)
            return list;
        Map<TreeNode,TreeNode> parent_map = new HashMap<>();
        parentpointer(root,parent_map);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        Map<TreeNode , Boolean> visited = new HashMap<>();
        visited.put(target , true);
        int dist = 0;
        while(!q.isEmpty())
        {
            int n = q.size();
            if(dist == k)
                break;
            dist++;
            for(int i=0;i<n;i++)
            {
                TreeNode curr = q.poll();
                if(curr.left!=null && visited.get(curr.left) == null)
                {
                    q.add(curr.left);
                    visited.put(curr.left , true);
                }
                if(curr.right!=null && visited.get(curr.right) == null)
                {
                    q.add(curr.right);
                    visited.put(curr.right , true);
                }
                if(parent_map.get(curr)!=null && visited.get(parent_map.get(curr)) == null)
                {
                    q.add(parent_map.get(curr));
                    visited.put( parent_map.get(curr) , true);
                }
            }
        }
        while(!q.isEmpty())
        {
            TreeNode curr = q.poll();
            list.add(curr.val);
        }
        return list;
    }
    void parentpointer(TreeNode root , Map<TreeNode , TreeNode> parent_map)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode curr = q.poll();
                if(curr.left!=null)
                {
                    q.add(curr.left);
                    parent_map.put(curr.left,curr);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                    parent_map.put(curr.right,curr);
                }
            }
        }
    }
    
}