public class Solution {
    public int solve(int[] A, int B) {
        // Greedy Approach
        int s=0, ans=0, cs, n=A.length;
        while(s<n)
        {
            cs = (s+B-1 < n ? s+B-1 : n-1);
            while(cs>=0 && cs>=(s-B+1) && A[cs]!=1)
                cs--;
            if(cs<(s-B+1) || cs<0)
                return -1;
            s = cs + B;
            ans++;
        }
        return ans;
    }
}
