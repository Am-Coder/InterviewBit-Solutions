public class Solution {
    
    public int exist(String[] A, String B) {
        int r = A.length;
        int c = A[0].length();
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (A[i].charAt(j) == B.charAt(0)) {
                    dfs(A, i, j, B, 0);
                }
                if (ans) {
                    return 1;
                }
            }
        }
        return 0;
    }
    
    boolean ans = false;
    public void dfs(String[] A, int i, int j, String B, int len) {
        
        if (len >= B.length()) {
            ans = true;
            return;
        }
        
        if (i < 0 || i >= A.length || j < 0 || j >= A[0].length()) {
            return;
        }
        
        if (A[i].charAt(j) == B.charAt(len)) {
            dfs(A, i + 1, j, B, len + 1);
            dfs(A, i - 1, j, B, len + 1);
            dfs(A, i, j + 1, B, len + 1);
            dfs(A, i, j - 1, B, len + 1);
        }
    }
}
