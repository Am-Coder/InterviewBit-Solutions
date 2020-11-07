

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
        public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
            sol = new ArrayList<>();
            temp = new LinkedList<>();
            solver(A,B,0);
            return sol;
        }
        ArrayList<ArrayList<Integer>> sol;
        Deque<Integer> temp;
        
        public void solver(TreeNode A, int B, int cursum){
            if(A.left ==null && A.right ==null){
                if(cursum + A.val == B){
                    ArrayList<Integer> imp = new ArrayList<>(temp);
                    imp.add(A.val);
                    sol.add(imp);
                }
                return;
            }
            // if(cursum > B){
            //     return;
            // }
            temp.addLast(A.val);
            if(A.left != null)
                solver(A.left,B,A.val + cursum);
            if(A.right != null)
                solver(A.right,B,A.val+cursum);
            temp.removeLast();
        }
    }

