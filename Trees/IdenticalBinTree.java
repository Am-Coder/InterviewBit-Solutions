

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
        public int isSameTree(TreeNode A, TreeNode B) {
            return identi(A,B) ? 1: 0;
        }
        
        public boolean identi(TreeNode A, TreeNode B){
            if(A == null && B == null){
                return true;
            }
            
            if( (A == null && B != null) || (A != null && B == null) ){
                return false;
            }
            
            if(A.val != B.val){
                return false;
            }
            
            return identi(A.left,B.left)&&identi(A.right,B.right); 
        }
    }

