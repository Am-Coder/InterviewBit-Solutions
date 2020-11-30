public class Solution {
    public int wordBreak(String A, ArrayList<String> B) {
        if(A==null)
            return 0;
        
        dp1 = new int[A.length()+1];
        HashSet<String> hs = new HashSet();
        hs.addAll(B);
        Arrays.fill(dp1, -1);
        
        return mcm2(A, 0, A.length(), hs);
        
        
        // MLE in mcm memoize with 2d matrix
        // int n = A.length();
        // HashSet<String> hs = new HashSet<>();
        // dp = new int[n+1][n+1];
        // for(int i=0; i<=n; i++){
        //     Arrays.fill(dp[i], -1);
        // }
        // for(String str: B)
        //     hs.add(str);
        
        // return mcm(A,0,n,hs);
    }
    
    int[] dp1;
    public int mcm2(String A, int pos, int end, HashSet<String> hs){
        if(pos==end) return 1;
        
        if(dp1[pos] != -1)
            return dp1[pos];
        
        for(int i=pos; i<end && i<pos+20; i++){
            if(hs.contains(A.substring(pos,i+1)) && mcm2(A, i+1, end, hs) == 1){
                return dp1[pos]=1;
            }
        }
    
        return dp1[pos] = 0;
    }
    
    int[][] dp ;
    public int mcm(String A, int i, int j, HashSet<String> hs){
        
        if(i >= j)
            return dp[i][j] = 0;
        
        if(hs.contains(A.substring(i,j)))
            return dp[i][j] = 1;
        
        if(dp[i][j] != -1)
            return dp[i][j];
        
        for(int k=i+1; k<j; k++){
            if(k - i >=21)
                return 0;
            
            if(dp[i][k] == -1)
                dp[i][k] = mcm(A,i,k,hs);
            if(dp[k][j] == -1)
                dp[k][j] = mcm(A,k,j,hs);
            
            if( (dp[i][k] & dp[k][j]) == 1)
                return dp[i][j] = 1;
        }
        
        return dp[i][j] = 0;
    }   
        
}       
        