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
    public int t2Sum(TreeNode A, int B) {
        hs = new ArrayList<>();
        inorder(A);
        int st = 0;
        int end = hs.size()-1;
        while(st<end){
            int temp = hs.get(st)+hs.get(end);
            if(temp == B){
                return 1;
            }else if(temp < B){
                st++;
            }else{
                end--;
            }
        }
        return 0;
    }
    
    ArrayList<Integer> hs;
    public void inorder(TreeNode A){
        if(A==null){
            return;
        }
        inorder(A.left);
        hs.add(A.val);
        inorder(A.right);
    }

}
