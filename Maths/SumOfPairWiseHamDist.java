

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        int max = 1000000007;
        public int hammingDistance(final List<Integer> A) {
            int n = A.size();
            long sum = 0;
            for(int i=0; i<32; i++){
                long zero = 0;
                long one = 0;
                for(int j=0; j<n; j++){
                    if((A.get(j) & 1<<i) > 0){
                        one++;
                    }else{
                        zero++;
                    }
                    
                }
                sum = (sum%max + ((2%max)*(one%max)*(zero%max))%max);
                sum = sum%max;
            }
            return (int)sum%max;
        }
    }

