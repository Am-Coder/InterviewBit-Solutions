public class Solution {
    public int solve(int A) {
        A+=1;
        int count =0;
        for(int i=0; i<32; i++){
            count=(count%1000000007+(A/(int )pow(2,i+1))*(int )pow(2,i)%1000000007+
                    Math.max(A%(int)Math.pow(2,i+1)-(int)Math.pow(2,i),0)%1000000007)%1000000007;
        }
        return count;
    }
}
