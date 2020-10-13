/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode cur = A;
        ListNode prev = null;
        ListNode head = cur;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                int num = cur.val;
                while(cur != null && cur.val == num){
                    cur = cur.next;
                }
                if(prev == null){
                    head = cur;
                }else{
                    prev.next = cur;
                }
            }else{
                prev = cur;
                cur = cur.next;
            }
            
        }
        return head;
    }
}
