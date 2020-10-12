/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        Queue<Integer> st1 = new LinkedList<>();
        Queue<Integer> st2 = new LinkedList<>();
        ListNode cur = first;
        while(cur!=null){
            st1.add(cur.val);
            cur = cur.next;
        }
        
        cur = second;
        while(cur!=null){
            st2.add(cur.val);
            cur = cur.next;
        }
        
        ListNode root = new ListNode(-1);
        int carry = 0;
        
        while(!st1.isEmpty() && !st2.isEmpty()){
            int n1 = st1.poll();
            int n2 = st2.poll();
            int sum = n1 + n2 + carry;
            if(sum>=10){
                ListNode n = new ListNode(sum-10);
                n.next = root.next;
                root.next = n;
                carry = 1;
            }else{
                ListNode n = new ListNode(sum);
                n.next = root.next;
                root.next = n;
                carry = 0;
            }
        }
        
        while(!st1.isEmpty()){
            int n1 = st1.poll();
            int sum = n1 + carry;
            if(sum>=10){
                ListNode n = new ListNode(sum-10);
                n.next = root.next;
                root.next = n;
                carry = 1;
            }else{
                ListNode n = new ListNode(sum);
                n.next = root.next;
                root.next = n;
                carry = 0;
            }
        }
        
        while(!st2.isEmpty()){
            int n1 = st2.poll();
            int sum = n1 + carry;
            if(sum>=10){
                ListNode n = new ListNode(sum-10);
                n.next = root.next;
                root.next = n;
                carry = 1;
            }else{
                ListNode n = new ListNode(sum);
                n.next = root.next;
                root.next = n;
                carry = 0;
            }
        }
        if(carry!=0){
            ListNode n = new ListNode(1);
            n.next = root.next;
            root.next = n;
            carry = 0; 
        }
        
        return reverse(root.next);
    }
    
    public ListNode reverse(ListNode n){
        ListNode cur = n;
        ListNode prev = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
