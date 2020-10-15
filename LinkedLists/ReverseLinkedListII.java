/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(B == C){
            return A;
        }
        
        ListNode cur = A;
        int i=0;
        ListNode prev = null;
        while(cur != null){
            i++;
            if(i == B){

                ListNode thead = rev(cur,C - B + 1 );
                if(prev == null){
                    A = thead;    
                }else{
                    prev.next = thead;
                }

                cur = cur.next;
                prev = cur;
                break;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        return A;
    }
    
    public ListNode rev(ListNode node, int C){
        ListNode next = node;
        int tmp = C;
        ListNode prev = null;
        while(tmp != 0){
            ListNode im = next.next;
            next.next = prev;
            prev = next;
            next = im;
            tmp--;
        }
        node.next = next;
        return prev;
    }
}
