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
    public int maxPathSum(TreeNode root) {
        int maximum[]=new int[1];
        maximum[0]=Integer.MIN_VALUE;
        maxPathDown(root,maximum);
        return maximum[0];
    }
    public int maxPathDown(TreeNode node,int maximum[]){
        if(node==null){
            return 0;
        }
        int left=Math.max(0,maxPathDown(node.left,maximum));
        int right=Math.max(0,maxPathDown(node.right,maximum));
        maximum[0]=Math.max(maximum[0],left+right+node.val);
        return Math.max(left,right)+node.val;
    }
}