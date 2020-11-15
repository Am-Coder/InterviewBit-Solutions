/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode flatten(TreeNode a) {
        ArrayList<Integer> sol = new ArrayList<Integer>();
        preorder(sol,a);
        TreeNode root = new TreeNode(-1);
        TreeNode temp = root;
        for(int val: sol){
            TreeNode n1 = new TreeNode(val);
            temp.right = n1;
            temp.left = null;
            temp = temp.right;
        }
        return root.right;
    }
    
    public void preorder(ArrayList arr, TreeNode a){
        if(a == null){
            return;
        }
        arr.add(a.val);
        preorder(arr,a.left);
        preorder(arr,a.right);
    }
}
