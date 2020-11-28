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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        q.add(A);
        while(!q.isEmpty()){
            Queue<TreeNode> aux = new LinkedList<>();
            temp.clear();
            while(!q.isEmpty()){
                
                TreeNode tempo = q.poll();
                temp.add(tempo.val);
                if(tempo.left != null){
                    aux.add(tempo.left);
                }
                
                if(tempo.right != null){
                    aux.add(tempo.right);
                }
                
            }
            sol.add((ArrayList<Integer>)temp.clone());
            q.addAll(aux);
        }
        return sol;
    }
}
