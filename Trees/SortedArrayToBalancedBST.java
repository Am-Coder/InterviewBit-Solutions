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
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) {
        return maketree(A,0,A.length - 1);
    }
    
    public TreeNode maketree(int[] arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid = st + (end-st)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = maketree(arr,st,mid - 1);
        root.right = maketree(arr,mid+1,end);
        return root;
    }
}
