

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
        public int lca(TreeNode A, int B, int C) {
            
            ans = "";
            found = false;
            dfs(A,B,"");
            if(!found){
                return -1;
            }
            String[] arr1 = ans.split(" ");
            
            ans = "";
            found = false;
            dfs(A,C,"");
            if(!found){
                return -1;
            }
            String[] arr2 = ans.split(" ");
            int i=0;
            int j=0;
            while(i < arr1.length && arr2.length > j && arr1[i].equals(arr2[j])){
                i++;
                j++;
            }
            
            return Integer.parseInt(arr1[i-1]);
        }
        String ans;
        boolean found = false;
        public void dfs(TreeNode A, int num, String sol){
            if(A == null || found){
                return;
            }
            if(A.val == num){
                sol = sol + " " + A.val;
                ans = sol;
                found = true;
                return;
            }
            
            String str = sol + " " + A.val;
            dfs(A.left, num, str);
            dfs(A.right, num, str);
        }
    }

