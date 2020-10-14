/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A, int B) {
        ListNode cur = A;
        ArrayList<Integer> arr = new ArrayList<>();
        int i=1;
        while(cur != null){
            if(i%2 == 1) {
                ListNode temp = cur;
                int cou = B;
                arr.clear();
                while(cou != 0){
                    arr.add(temp.val);
                    temp = temp.next;
                    cou--;
                }
                Collections.reverse(arr);
                temp = cur;
                for(int num: arr){
                    temp.val = num;
                    temp = temp.next;
                }
                cur = temp;
                i++;
            } else {
                int cou = B;
                while(cou != 0){
                    cou--;
                    cur = cur.next;
                }
                i++;
            }
        }
        
        return A;
    }
}
