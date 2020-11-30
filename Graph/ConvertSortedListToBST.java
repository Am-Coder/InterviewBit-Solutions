/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    public TreeNode sortedListToBST(ListNode a) {
        ListNode cur = a;
        ArrayList<Integer> arr = new ArrayList<>();
        while(cur != null){
            arr.add(cur.val);
            cur = cur.next;
        }
        return maketree(arr,0,arr.size()-1);
    }
    
    public TreeNode maketree(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid = st + (end-st)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = maketree(arr,st,mid - 1);
        root.right = maketree(arr,mid+1,end);
        return root;
    }

}
