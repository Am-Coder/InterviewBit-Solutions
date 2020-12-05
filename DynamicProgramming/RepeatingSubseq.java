public class Solution {
        
        public int anytwo(String A) {
            String B = A;
            int n = A.length();
            int[][] dpr = new int[n+1][n+1];
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n ; j++){
                    if(A.charAt(i-1) == B.charAt(j-1) && i!=j){
                        dpr[i][j] = 1 + dpr[i-1][j-1];
                    }else{
                        dpr[i][j] = Math.max(dpr[i-1][j],dpr[i][j-1]);
                    }
                }
            }
            return dpr[n][n] >= 2 ? 1: 0;
            
        }
        
        
}
