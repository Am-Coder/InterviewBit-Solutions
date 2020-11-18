/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int isBalanced(TreeNode A) {
        
        if(A == null){
            return 1;
        }
        int h1 = height(A.left);
        int h2 = height(A.right);
        if(Math.abs(h1-h2) > 1){
            return 0;
        }
        
        return 1&isBalanced(A.left)&isBalanced(A.right);
    }
    
    public int height(TreeNode A){
        if(A == null){
            return 0;
        }
        return 1 + Math.max(height(A.left), height(A.right));
    }
}
