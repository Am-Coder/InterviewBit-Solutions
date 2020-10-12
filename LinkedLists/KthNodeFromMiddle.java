/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A, int B) {
        ListNode slow = A;
        ListNode fast = A;
        
        int cou = 0;
        while(fast != null && fast.next != null){
            cou++;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(B > cou){
            return -1;
        }
        
        B = cou - B;
        while(B != 0){
            A = A.next;
            B--;
        }
        return A.val;
        
    }
}
