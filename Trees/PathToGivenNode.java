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
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ans = "";
        found = false;
        search(A,B,"");
        String[] arr = ans.split(" ");
        ArrayList<Integer> sol = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i].length()>0)
            sol.add(Integer.parseInt(arr[i]));
        }
        return sol;
    }
    
    boolean found = false;
    String ans = "";
    public void search(TreeNode A, int B, String str){
        if(A == null || found){
            return;
        }
        if(A.val == B){
            found = true;
            ans = str+" "+String.valueOf(B);
            return;
        }
        search(A.left, B, str + " " + String.valueOf(A.val) );
        
        search(A.right, B, str + " " + String.valueOf(A.val) );
    }
}
