/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    ArrayList<Integer> arr;
    int itr;
    public Solution(TreeNode root) {
        arr = new ArrayList<>();
        itr = 0;
        inorder(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(itr == arr.size()){
            return false;
        }
        return true;
    }

    /** @return the next smallest number */
    public int next() {
        return arr.get(itr++);
    }
    
    public void inorder(TreeNode A){
        if(A==null){
            return;
        }
        inorder(A.left);
        arr.add(A.val);
        inorder(A.right);
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
