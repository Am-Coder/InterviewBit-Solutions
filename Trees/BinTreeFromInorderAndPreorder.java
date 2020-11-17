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
    int Bend = 0;
    public TreeNode buildTree(ArrayList<Integer> B, ArrayList<Integer> A) {
    
        if(A.size() == 0){
            return null;
        }
        Bend = 0;
        return maketree(A,B,0,A.size()-1);
    }
    
    public TreeNode maketree(ArrayList<Integer> A, ArrayList<Integer> B, int st, int end){
        if(st>end)
            return null;

        TreeNode root = new TreeNode(B.get(Bend++));
        if(st == end){
            return root;
        }
        
        int idx = find(A,st,end,root.val);
        root.left = maketree(A,B,st,idx-1);
        root.right = maketree(A,B,idx+1,end);
        return root;
        
    }
    
    public int find(ArrayList<Integer> A, int st, int end,int val){
        for(int i=st; i<=end; i++){
            if(A.get(i) == val){
                return i;
            }
        }
        return -1;
    }
}
