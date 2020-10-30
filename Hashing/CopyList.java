

    /**
     * Definition for singly-linked list with a random pointer.
     * class RandomListNode {
     *     int label;
     *     RandomListNode next, random;
     *     RandomListNode(int x) { this.label = x; }
     * };
     */
    public class Solution {
        public RandomListNode copyRandomList(RandomListNode head) {
            RandomListNode cur = head;
            RandomListNode aux = new RandomListNode(-1);
            RandomListNode tmp = aux;
            HashMap<Integer,RandomListNode> hm = new HashMap<>();
            
            while(cur != null){
                RandomListNode chi = new RandomListNode(cur.label);
                aux.next = chi;
                aux = aux.next;
                hm.put(cur.label,chi);
                cur = cur.next;
            }
            cur = head;
            aux = tmp.next;
            while(cur != null){
                if(cur.random != null){
                    RandomListNode rn = hm.get(cur.random.label);
                    aux.random = rn;
                }
                cur = cur.next;
                aux = aux.next;
            }
            
            return tmp.next;
        }
    }

