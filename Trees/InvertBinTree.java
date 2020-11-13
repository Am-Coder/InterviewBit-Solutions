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
    public TreeNode invertTree(TreeNode A) {
        if(A == null){
            return null;
        }
        TreeNode n1 = A.left;
        TreeNode n2 = A.right;
        A.left = n2;
        A.right = n1;
        
        invertTree(A.left);
        invertTree(A.right);
        
        return A;
    }
    
}
