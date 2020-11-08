

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
        public ArrayList<Integer> solve(TreeNode A) {
            
            Queue<TreeNode> q = new LinkedList<>();
            Queue<TreeNode> aux = new LinkedList<>();
            q.add(A);
            TreeNode cur = A;
            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            while(!q.isEmpty()){
                aux.clear();
                ArrayList<Integer> temp = new ArrayList<>();
                while(!q.isEmpty()){
                    TreeNode nn = q.poll();
                    temp.add(nn.val);
                    if(nn.left != null)
                        aux.add(nn.left);
                    if(nn.right != null)
                        aux.add(nn.right);
                }
                if(temp.size()>0){
                    arr.add(temp);
                }
                q.addAll(aux);
            }
            ArrayList<Integer> sol = new ArrayList<>();
            for(int i=arr.size()-1; i>=0; i--){
                sol.addAll(arr.get(i));
            }
            return sol;
        }
    }

