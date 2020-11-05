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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        int rev = 0;
        while(!q.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            Queue<TreeNode> aux = new LinkedList<>();
            while(!q.isEmpty()){
                TreeNode tt = q.poll();
                temp.add(tt.val);
                if(tt.left != null){
                    aux.add(tt.left);
                }
                if(tt.right != null){
                    aux.add(tt.right);
                }
            }
            if(rev == 0){
                sol.add(temp);
            }else{
                ArrayList<Integer> reve = new ArrayList<>();
                for(int i=temp.size()-1; i>=0; i--){
                    reve.add(temp.get(i));
                }
                sol.add(reve);
            }
            rev ^= 1;
            q.addAll(aux);
        }
        return sol;
    }
}
