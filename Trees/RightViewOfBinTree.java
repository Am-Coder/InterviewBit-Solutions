

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
            ArrayList<Integer> sol = new ArrayList<>();
            ArrayList<Integer> arr = new ArrayList<>();
            
            ArrayList<TreeNode> temp = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(A);
            while(!q.isEmpty()){
                arr.clear();
                temp.clear();
                while(!q.isEmpty()){
                    TreeNode tn = q.poll();
                    arr.add(tn.val);
                    if(tn.left!= null){
                        temp.add(tn.left);
                    }
                    if(tn.right!=null){
                        temp.add(tn.right);
                    }
                }
                if(arr.size()>=1){
                    sol.add(arr.get(arr.size()-1));
                }
                q.addAll(temp);
            }
            return sol;
        }
    }

