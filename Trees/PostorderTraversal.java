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
    public int[] postorderTraversal(TreeNode A) {
        Stack<TreeNode> st = new Stack<>();
        Stack<TreeNode> sol = new Stack<>();
        
        st.push(A);
        while(!st.empty()){
            TreeNode n = st.pop();
            sol.push(n);
            
            if(n.left != null && n.left.val != -1){    
                st.push(n.left);
            }
            if(n.right != null && n.right.val != -1){
                st.push(n.right);
            }
            
        }
        int[] arr = new int[sol.size()];
        int i=0;
        while(!sol.empty()){
            arr[i] = sol.pop().val;
            i++;
        }
        return arr;
    }
}
