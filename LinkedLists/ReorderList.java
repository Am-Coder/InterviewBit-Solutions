/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode A) {
        
        Stack<ListNode> st = new Stack<>();
        ListNode cur = A;
        int i=0;
        while(cur != null){
            st.push(cur);
            cur = cur.next;
            
            i++;
        }
        ListNode hd = new ListNode(-1);
        ListNode tmp = hd;
        cur = A;
        while(i>=0){
            tmp.next = cur;
            tmp = tmp.next;
            cur = cur.next;
            i--;
            
            if(i<0){
                break;
            }
            tmp.next = st.pop();
            tmp = tmp.next;
            i--;
        }
        tmp.next = null;
        return hd.next;
        
    }
}

