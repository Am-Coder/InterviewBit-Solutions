/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode prev = A;
        ListNode next = A.next;
        
        while(prev != null && next != null){
            int temp = prev.val;
            prev.val = next.val;
            next.val = temp;
            prev = next.next;
            if(prev != null)
                next = prev.next;
        }
        
        return A;
    }
}
