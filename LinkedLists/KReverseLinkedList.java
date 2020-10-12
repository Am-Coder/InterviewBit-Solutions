/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        if(B == 1 || A.next == null){
            return A;
        }
        ListNode cur = A;
        int temp = B - 1;
        ListNode head = null;
        while(temp != 0){
            cur=cur.next;
            temp--;
        }
        head = cur;
        cur = A;
        
        ListNode tmph = null;
        while(cur != null){
            ListNode next = cur;
            ListNode prev = null;
            temp = B;
            while( temp != 0 && next != null ){
                ListNode tmp = next.next;
                next.next = prev;
                prev = next;
                next = tmp;
                temp--;
            }
            if(tmph!=null){
                while(tmph.next !=null){
                    tmph = tmph.next;
                }
                tmph.next = prev;
            }
            
            tmph = prev;
            cur = next;
        }

        return head;
    }
}
