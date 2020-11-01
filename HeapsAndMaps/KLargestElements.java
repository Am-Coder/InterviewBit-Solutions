public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            pq.add(A.get(i));
            if(pq.size() > B)
                pq.poll();
        }
        ArrayList<Integer> sol = new ArrayList<>();
        while(!pq.isEmpty()){
            sol.add(pq.poll());
        }
        return sol;
    }
}
