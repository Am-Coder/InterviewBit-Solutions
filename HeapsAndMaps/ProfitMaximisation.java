public class Solution {
    public int solve(int[] A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<A.length; i++){
            pq.add(A[i]);
        }
        int prof = 0;
        while(B != 0){
            int num = pq.poll();
            prof += num;
            num--;
            if(num != 0)
                pq.add(num);
            B--;
        }
        return prof;
    }
}
