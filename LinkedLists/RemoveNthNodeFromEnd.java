/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        int tmp = B;
        ListNode cur = A;
        while(tmp != 0 && cur != null){
            cur = cur.next;
            tmp--;
        }
        
        ListNode rem = A;
        while(cur != null && cur.next != null){
            cur = cur.next;
            rem = rem.next;
        }
        
        if(cur == null || rem == A){
            A = A.next;
        }else{
            rem.next = rem.next.next;
        }
        return A;
    }
}

