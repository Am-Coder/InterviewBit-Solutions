public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isMatch(final String A, final String B) {
        int n = A.length();
        int m = B.length();
        boolean[][] dpr = new boolean[n+1][m+1];
        dpr[0][0] = true;
        for(int i=1; i<=m; i++){
            if(B.charAt(i-1) == '*')
                dpr[0][i] = dpr[0][i-2];
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(B.charAt(j-1) == '.'){
                    dpr[i][j] = dpr[i-1][j-1];
                }else if(B.charAt(j-1) == '*'){
                    if(B.charAt(j-2) == A.charAt(i-1) || B.charAt(j-2) == '.')
                        dpr[i][j] = dpr[i-1][j]||dpr[i][j-2];
                    else
                        dpr[i][j] = dpr[i][j-2];
                }else if(B.charAt(j-1) == A.charAt(i-1)){
                    dpr[i][j] = dpr[i-1][j-1];
                }
                else{
                    dpr[i][j] = false;
                }
            }
        }
        return dpr[n][m] ? 1:0;
    }
}
