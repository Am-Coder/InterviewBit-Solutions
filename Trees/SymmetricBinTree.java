

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
        public int isSymmetric(TreeNode A) {
            return identi(A.left,A.right)?1:0;
        }
        
        public boolean identi(TreeNode A, TreeNode B){
            if(A == null && B == null){
                return true;
            }
            if((A == null && B!=null)||(A != null && B == null)||(A.val != B.val)){
                return false;
            }
            return identi(A.left,B.right)&&identi(A.right,B.left);
        }
    }

