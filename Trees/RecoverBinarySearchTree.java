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

    TreeNode prev ,first , last, middle;


    public ArrayList<Integer> recoverTree(TreeNode A) {
        ArrayList<Integer> sol = new ArrayList<>();
        prev = first = last = middle = null;
        inorder(A);
        sol.add(first.val);
        if(last != null)
            sol.add(last.val);
        else
            sol.add(middle.val);
        Collections.sort(sol);
        return sol;
    }   
    

    
    public void inorder(TreeNode A){
        if(A==null){
            return;
        }
        inorder(A.left);
        if(prev != null && prev.val > A.val){
            if(first == null){
                first = prev;
                middle = A;
            } else {
                last = A;
            }
        }
        prev = A;
        inorder(A.right);
    }
    
}       
        