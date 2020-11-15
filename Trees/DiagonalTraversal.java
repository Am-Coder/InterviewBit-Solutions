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
    public int[] solve(TreeNode A) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(A);
        ArrayList<Integer> sol = new ArrayList<>();
            while(!q.isEmpty()){
                TreeNode tn = q.poll();
                TreeNode temp = tn;
                sol.add(tn.val);
                while(tn.right != null && tn.right.val != -1){
                    sol.add(tn.right.val);
                    tn = tn.right;
                }
                while(temp != null){
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    temp = temp.right;
                }
            }
        int[] arr = new int[sol.size()];
        for(int i=0; i<sol.size(); i++){
            arr[i] = sol.get(i);
        }
        return arr;

    }
}
