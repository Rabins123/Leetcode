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
    public int[] findMode(TreeNode root) {
        /*  Doing the inorder traversal of the binary search tree and 
       then find the highest frequenecy elements.*/
        List<Integer> list=new ArrayList<>();
        helper(list,root);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:list)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=maximum(map);
       // List to store the elements with maximum frequency.
       List<Integer> res=new ArrayList<>();
        for(int key:map.keySet())
         if(max==map.get(key))
             res.add(key);
       
        // Storing the mode elemnts from the list in the array.
       int[] ans=new int[res.size()];
        int index=0;
        for(int i:res)
            ans[index++]=i;
        
        return ans;     
    }
    
    // Function to store the inorder traversal of BST in the list
    public void helper(List<Integer> list, TreeNode root)
    {
        if(root==null)
             return;
        helper(list,root.left);
        list.add(root.val);
        helper(list,root.right);
    }
    
    // Function to find the maximum frequency in the hashmap
    public int maximum(HashMap<Integer,Integer> map)
    {
        int maxFrequency=0;
         for(int x:map.keySet())
            maxFrequency=Math.max(maxFrequency,map.get(x));
         return maxFrequency;
    }
}