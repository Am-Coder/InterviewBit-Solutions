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
    public int[] preorderTraversal(TreeNode A) {
    
        sol = new ArrayList<>();
        preorder(A);
        int[] solu = new int[sol.size()];
        for(int i=0; i<sol.size(); i++){
            solu[i] = sol.get(i);
        }
        return solu;
    }
    ArrayList<Integer> sol;
    public void preorder(TreeNode A){
        
        if(A == null){
            return;
        }
        
        sol.add(A.val);
        preorder(A.left);
        preorder(A.right);
    }
}
