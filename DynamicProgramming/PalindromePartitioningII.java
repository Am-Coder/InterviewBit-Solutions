public class Solution {
    public int minCut(String A) {
        int n = A.length();
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return mcm(A,0,A.length());
    }
    int[] dp;
    public int mcm(String A, int st, int end){
        if(st == end) return 1;
        
        if(dp[st] != -1)
            return dp[st];
        
        int min = Integer.MAX_VALUE;
        for(int i=st; i<=end; i++){
            if(isPalin(A.substring(st,i))){
                if( i == end)
                    return 0;
                else
                    min = Math.min(min, 1 + mcm(A,i,end));
            }
        }
        return dp[st] = min;
    }
    public boolean isPalin(String str){
        if(str.length() == 0)
            return false;
        int st = 0;
        int end = str.length() - 1;
        while(st<=end){
            if(str.charAt(st) != str.charAt(end))
                return false;
            st++;
            end--;
        }
        return true;
    }
}
