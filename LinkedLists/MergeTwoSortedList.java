/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode c1 = A;
        ListNode c2 = B;
        ListNode st = new ListNode(-1);
        ListNode temp = st;
        while(c1 != null && c2 != null){
            if(c1.val > c2.val){
                st.next = c2;
                c2 = c2.next;
            }else{
                st.next = c1;
                c1 = c1.next;
            }
            st = st.next;
        }
        while(c1 != null){
            st.next = c1;
            c1 = c1.next;
            st = st.next;
        }
        while(c2 != null){
            st.next = c2;
            c2 = c2.next;
            st = st.next;
        }
        
        return temp.next;
    }
}