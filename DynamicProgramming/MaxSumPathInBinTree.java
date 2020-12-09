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
    public int maxPathSum(TreeNode A) {
    
        res = Integer.MIN_VALUE;
        solve(A);
        return res;
    }
    
    int res;
    int solve(TreeNode n){
        if(n==null)
            return 0;
            
        int l = solve(n.left);
        int r = solve(n.right);
        
        int temp = Math.max(Math.max(l,r)+n.val, n.val);
        int ans = Math.max(temp, l+r+n.val);
        res = Math.max(res,ans);
        
        return temp;
    }
}
