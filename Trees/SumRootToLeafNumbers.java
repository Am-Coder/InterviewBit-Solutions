

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
    import java.math.BigInteger;
    public class Solution {
        public int sumNumbers(TreeNode A) {
            ans = new BigInteger("0");
            minHt(A, "");
            ans = ans.mod(new BigInteger("1003"));
            return ans.intValue();
        }
        BigInteger ans;
        public void minHt(TreeNode A, String val){
        
            if(A.left == null && A.right == null){
                BigInteger b1 = new BigInteger(val+String.valueOf(A.val));
                ans = ans.add(b1);
                return;
            }
            
            if(A.left != null){
                minHt(A.left, val + String.valueOf(A.val));
            }
            
            if(A.right != null){
                minHt(A.right, val + String.valueOf(A.val));
            }
        }
    }

