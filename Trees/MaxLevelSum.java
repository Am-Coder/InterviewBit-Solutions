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
    public int solve(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> aux = new LinkedList<>();
        q.add(A);
        int ms = 0;
        while(!q.isEmpty()){
            aux.clear();
            int sum =0;
            while(!q.isEmpty()){
                TreeNode nn = q.poll();
                sum += nn.val;
                if(nn.left != null)
                    aux.add(nn.left);
                if(nn.right != null)
                    aux.add(nn.right);
            }
            ms = Math.max(ms, sum);
            q.addAll(aux);
        }
        return ms;
    }
}
