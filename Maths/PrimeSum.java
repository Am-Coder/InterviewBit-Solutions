

    public class Solution {
        public ArrayList<Integer> primesum(int A) {
            boolean[] sieve = new boolean[A+1];
            int n = A;
            sieve[2] = true;
            Arrays.fill(sieve, true);
            for(int i=2; i*i<=n; i++){
                
                if(sieve[i])
                    for(int j=i*i; j<=n; j+=i){
                        sieve[j] = false;
                    }
            }
            ArrayList<Integer> sol = new ArrayList<>();
            for(int i=2; i<A; i++){
                if(sieve[i] && sieve[A-i]){
                    sol.add(i);
                    sol.add(A-i);
                    break;
                }
            }
            
            return sol;
        }
    }

