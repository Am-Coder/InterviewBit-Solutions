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
    public TreeNode solve(TreeNode A, TreeNode B) {
        
        TreeNode head = merge(A,B);;
        
        return head;
    }
    
    public TreeNode merge(TreeNode A, TreeNode B){
        if(A == null && B == null)
            return null;
        if(A == null && B != null){
            return B;
        }
        if(A != null && B == null){
            return A;
        }
        
        TreeNode nn = new TreeNode(A.val + B.val);
        nn.left = merge(A.left, B.left);
        nn.right = merge(A.right, B.right);
        return nn;
    }
}
