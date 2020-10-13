/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
        // Hare and Tortoise Algo
        ListNode har = a;
        ListNode tur = a;
        ListNode meet = null;
        while(tur != null && tur.next != null){
 
            har = har.next;
            tur = tur.next.next;
            if(har != null && tur != null && har.val == tur.val){
                meet = tur;
                break;
            }
        }
        
        ListNode cur = a;
        if(meet != null)
            while(cur.val != meet.val){
                cur = cur.next;
                meet = meet.next;
            }
        
        return meet;
    }
}

