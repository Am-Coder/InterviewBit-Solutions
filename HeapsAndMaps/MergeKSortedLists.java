public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> A) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new customCompare());
        int k = A.size();
        for(int i=0; i<k; i++){
            pq.add(A.get(i));
        }
        ListNode node = pq.poll();
        ListNode ans = node;
        ListNode head = ans;
        if(node.next!= null){
            pq.add(node.next);
        }
        while(!pq.isEmpty()){
            node = pq.poll();
            ans.next = node;
            ans = ans.next;
            if(node.next != null){
                pq.add(node.next);
            }
        }
        return head;
    }
    
    public class customCompare implements Comparator<ListNode>{
        public int compare(ListNode a, ListNode b){
            if(a.val>b.val){
                return 1;
            }
            else if(a.val<b.val){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
}

