public class Solution {
    static void upleft(int i, int j, String[] A){
        int r = i-1;
        int c = j-1;
        while(r>=0 && c>=0 && A[r].charAt(c)=='0'){
            dp[r--][c--]+=1;
        }
        if(r>=0 && c>=0 && A[r].charAt(c)=='1') dp[r][c]+=1;
    }
    static void upright(int i, int j, String[] A){
        int r = i-1;
        int c = j+1;
        while(r>=0 && c<m && A[r].charAt(c)=='0'){
            dp[r--][c++]+=1;
        }
        if(r>=0 && c<m && A[r].charAt(c)=='1') dp[r][c]+=1;
    }
    static void bottomleft(int i, int j, String[] A){
        int r = i+1;
        int c = j-1;
        while(r<n && c>=0 && A[r].charAt(c)=='0'){
            dp[r++][c--]+=1;
        }
        if(r<n && c>=0 && A[r].charAt(c)=='1') dp[r][c]+=1;
    }
    static void bottomright(int i, int j, String[] A){
        int r = i+1;
        int c = j+1;
        while(r<m && c<n && A[r].charAt(c)=='0'){
            dp[r++][c++]+=1;
        }
        if(r<m && c<n && A[r].charAt(c)=='1') dp[r][c]+=1;
    }
    static void up(int i, int j, String[] A){
        int r = i-1;
        int c = j;
        while(r>=0 && A[r].charAt(c)=='0'){
            dp[r--][c]+=1;
        }
        if(r>=0 && A[r].charAt(c)=='1') dp[r][c]+=1;
    }
    static void down(int i, int j, String[] A){
        int r = i+1;
        int c = j;
        while(r<n && A[r].charAt(c)=='0'){
            dp[r++][c]+=1;
        }
        if(r<n && A[r].charAt(c)=='1') dp[r][c]+=1;
    }
    static void left(int i, int j, String[] A){
        int r = i;
        int c = j-1;
        while(c>=0 && A[r].charAt(c)=='0'){
            dp[r][c--]+=1;
        }
        if(c>=0 && A[r].charAt(c)=='1') dp[r][c]+=1;
    }
    static void right(int i, int j, String[] A){
        int r = i;
        int c = j+1;
        while(c<m && A[r].charAt(c)=='0'){
            dp[r][c++]+=1;
        }
        if(c<m && A[r].charAt(c)=='1') dp[r][c]+=1;
    }
    static int[][] dp;
    static int n,m;
    public int[][] queenAttack(String[] A) {
        dp = new int[A.length][A[0].length()];
        n = A.length;
        m = A[0].length();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(A[i].charAt(j)=='1'){
                    upleft(i,j,A);
                    upright(i,j,A);
                    bottomleft(i,j,A);
                    bottomright(i,j,A);
                    left(i,j,A);
                    right(i,j,A);
                    up(i,j,A);
                    down(i,j,A);
                }
            }
        }
        return dp;
    }
}

