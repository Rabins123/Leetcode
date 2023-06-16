/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* dfs(TreeNode* n, TreeNode* p, TreeNode* q){
        if(!n)return NULL;
        //
        
        if(n -> val == p -> val )return p;
        if(n -> val == q -> val)return q;
        
        //
        auto l = dfs(n -> left , p , q);
        auto r = dfs(n -> right , p , q);
        
        if(!l)return r;
        if(!r)return l;
        // if(l && r)return n;
        
        return n;

    }
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        return dfs(root , p , q);
    }
};