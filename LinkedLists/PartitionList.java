/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode A, int B) {
        ListNode less = new ListNode(-1);
        ListNode great = new ListNode(-1);
        ListNode cur = A;
        ListNode l = less;
        ListNode g = great;
        while(cur != null){
            if(cur.val < B){
                less.next = cur;
                less = less.next;
            }else{
                great.next = cur;
                great = great.next;
            }
            cur = cur.next;
        }
        great.next = null;
        if(l.val == less.val){
            A = g.next;
            return A;
        }
        A = l.next;
        less.next = g.next;
        return A;
    }
}

