

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
        public int hasPathSum(TreeNode A, int B) {
            ans = false;
            minHt(A, 0, B);
            return ans ? 1: 0;
        }
        boolean ans = false;
        public void minHt(TreeNode A, int val, int B){
            if(ans){
                return;
            }
            if(A.left == null && A.right == null){
                if(B == A.val + val){
                    ans = true;
                }
                return;
            }
            
            if(A.left != null){
                minHt(A.left, A.val+val, B);
            }
            
            if(A.right != null){
                minHt(A.right, A.val+val, B);
            }
        }
    }

