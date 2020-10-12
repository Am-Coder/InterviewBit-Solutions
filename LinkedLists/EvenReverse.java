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
        if(A.next == null)
            return A;
        ListNode cur = A.next;

        ArrayList<Integer> arr = new ArrayList<>();
        while(cur != null && cur.next != null){
            arr.add(cur.val);
            cur = cur.next.next;
        }
        if(cur != null){
            arr.add(cur.val);
        }
        Collections.reverse(arr);
        cur = A.next;
        int i=0;
        while(cur != null && cur.next != null){
            cur.val = arr.get(i);
            cur = cur.next.next;
            i++;
        }
        if(cur != null){
            cur.val = arr.get(i);
        }
        return A;
    }
}
