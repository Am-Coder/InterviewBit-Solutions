/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A) {
        ListNode cur = A;
        int zc = 0;
        int oc = 0;
        while(cur != null){
            if(cur.val == 0)
                zc++;
            if(cur.val == 1)
                oc++;
            cur = cur.next;
        }
        
        cur = A;
        while(zc != 0){
            cur.val = 0;
            zc--;
            cur = cur.next;
        }
        while(oc != 0){
            cur.val = 1;
            oc--;
            cur = cur.next;
        }
        return A;
    }
}
