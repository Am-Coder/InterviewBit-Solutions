

    public class Solution {
        public int[] solve(int[] A, int[] B, int C) {
            Arrays.sort(A);
            Arrays.sort(B);
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            int n = A.length;
            for(int i=n-1; i>=0; i--){
                for(int j=n-1; j>=0; j--){
                    int sum = A[i] + B[j];
                    pq.add(sum);
                    if(pq.size() > A.length){
                        int lastElement = pq.poll();
                        if(lastElement==sum) break;                    
                    }
                }
            }
            
            ArrayList<Integer> result = new ArrayList<Integer>(pq);
            Collections.sort(result, Collections.reverseOrder());
            int[] sol = new int[C];
            for(int i=0; i<C; i++){
                sol[i] = result.get(i);
            }
            return sol;
        }
    }

