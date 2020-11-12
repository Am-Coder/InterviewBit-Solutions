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
    public int kthsmallest(TreeNode A, int B) {
        ArrayList<Integer> sol = new ArrayList<>();
        inorder(A,sol);
        return sol.get(B-1);
    }
    public void inorder(TreeNode A, ArrayList sol){
        if(A==null){
            return;
        }
        inorder(A.left,sol);
        sol.add(A.val);
        inorder(A.right,sol);
    }
}
