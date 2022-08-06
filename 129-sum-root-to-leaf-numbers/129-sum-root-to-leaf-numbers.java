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
    int[] sum = new int[1];
    public int sumNumbers(TreeNode root) {
        sum[0] = 0;
        int[] arr = new int[1];
        arr[0]=0;
        rootToleafSum(root,arr);
        return sum[0];
    }
    void rootToleafSum(TreeNode root,int[] arr)
    {
        if(root == null)
            return;
        arr[0]= arr[0]*10 + root.val;
        if(root.left == null && root.right == null)
        {
            sum[0] += arr[0];
        }
        rootToleafSum(root.left,arr);
        rootToleafSum(root.right,arr);
        arr[0] = arr[0]/10;
    }
}