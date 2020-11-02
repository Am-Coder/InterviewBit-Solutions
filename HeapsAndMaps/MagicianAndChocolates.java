public class Solution {
    int mod = (int)1e9 + 7;
    public int nchoc(int A, int[] B) {
        int n = B.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            pq.add(B[i]);
        }
        long sum = 0;
        while(!pq.isEmpty() && A != 0){
            int num = pq.poll();
            if(num == 0)
                break;
            sum = (sum + num)%mod;
            pq.add(num/2);
            A--;
        }
        return (int)(sum%mod);
    }
}
