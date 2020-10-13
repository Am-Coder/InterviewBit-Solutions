

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     public int val;
     *     public ListNode next;
     *     ListNode(int x) { val = x; next = null; }
     * }
     */
    public class Solution {
        public int lPalin(ListNode A) {
            if(A.next == null)
                return 1;
            ListNode cur = A;
            Stack<Integer> arr = new Stack<>();
            while(cur != null){
                arr.push(cur.val);
                cur = cur.next;
            }
            cur = A;
            while(!arr.empty()){
                if(arr.peek() != cur.val){
                    return 0;
                } 
                arr.pop();
                cur = cur.next;
            }
            return 1;
        }
    }

