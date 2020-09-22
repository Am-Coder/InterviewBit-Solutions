public class Solution {
    public int cntBits(ArrayList<Integer> A) {
        int n = A.size();
        long max = 1000000007;
        long sum = 0;
        for(int i=0; i<32; i++){
            
            long one = 0;
            long zero = 0;
            for(int j=0; j<n; j++){
                if(((1<<i)&A.get(j)) > 0){
                    one++;
                }else{
                    zero++;
                }
            }
            sum = (sum%max + (2*one*zero))%max ;
            
        }
        return (int)(sum%max);
    }
}