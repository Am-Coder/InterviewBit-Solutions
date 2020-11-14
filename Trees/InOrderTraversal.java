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
    public int[] inorderTraversal(TreeNode A) {
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        st.push(A);
        while(!st.empty()){
            TreeNode n = st.peek();
            
            while(n.left != null){
                n = n.left;
                st.push(n);
            }
            
            while(!st.empty()){
                n = st.pop();
                arr.add(n.val);
                if(n.right != null){
                    st.add(n.right);
                    break;
                }
            }
        }
        while(!st.empty()){
            arr.add(st.pop().val);
        }
        int[] sol = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            sol[i] = arr.get(i);
        }
        return sol;
    }
}
