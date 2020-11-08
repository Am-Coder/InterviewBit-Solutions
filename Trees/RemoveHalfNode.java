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
    public TreeNode solve(TreeNode A) {
        if(A.left == null && A.right == null){
            return A;
        }
        
        if(A.left == null && A.right != null){
            return solve(A.right);
        }
        
        if(A.left != null && A.right == null){
            return solve(A.left);
        }
        
        A.left = solve(A.left);
        A.right = solve(A.right);
        
        return A;
        
    }
}
