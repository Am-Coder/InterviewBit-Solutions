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
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> sol = new ArrayList<>();
        TreeNode root = A;
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<TreeNode> arr = new ArrayList<>();
        q.add(A);
        while(!q.isEmpty()){
            boolean isIt = false;
            arr.clear();
            while(!q.isEmpty()){
                TreeNode tn = q.poll();
                boolean sib = false;
                if(tn.left != null && tn.right != null){
                    if(tn.left.val == B || tn.right.val == B){
                        sib = true;
                        isIt = true;
                    }
                }
                if(tn.left != null){
                    if(tn.left.val == B){
                        sib = true;
                        isIt = true;
                    }
                    if(!sib)
                        arr.add(tn.left);
                }
                if(tn.right != null){
                    if(tn.right.val == B){
                        isIt = true;
                        sib = true;
                    }
                    if(!sib)
                        arr.add(tn.right);
                }
            }
            if(isIt)
                break;
            q.addAll(arr);
        }
        
        sol.clear();
        for(TreeNode nn : arr){
            sol.add(nn.val);
        }
        return sol;
    }
}
