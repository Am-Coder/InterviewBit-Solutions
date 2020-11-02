public class Solution {
    HashMap<Integer, Integer> hm;
    Deque<Integer> dq;
    int cap;
    public Solution(int capacity) {
        hm = new HashMap<>();
        dq = new LinkedList<>();
        cap = capacity;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            dq.remove(key);
            dq.addFirst(key);
            return hm.get(key);
        }
        return -1;
    }
    
    public void set(int key, int value) {
        if(hm.containsKey(key)){
            dq.remove(key);
            dq.addFirst(key);
            hm.put(key, value);
        }else{
            if(hm.size() == cap){
                hm.remove(dq.removeLast());
                hm.put(key, value);
                dq.addFirst(key);
            }else{
                hm.put(key, value);
                dq.addFirst(key);
            }
        }
    }
}
