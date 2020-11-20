public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        if(A.size() == 1)
            return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<A.size(); i++){
            pq.add(A.get(i));
        }
        
        int num = pq.poll();
        int md = Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            int n1 = pq.poll();
            md = Math.max(md, n1 - num);
            num = n1;
        }
        
        return md;
    }
}
