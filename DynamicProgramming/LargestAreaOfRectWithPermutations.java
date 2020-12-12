public class Solution {
    public int solve(int[][] mat) {
        int R = mat.length;
        int C = mat[0].length;
        int[][] hist = new int[R+1][C+1];
        
        for(int i=0; i<C; i++){
            hist[0][i] = mat[0][i];
            for(int j=1; j<R; j++){
                hist[j][i] = mat[j][i] == 0 ? 0 : hist[j-1][i] + 1;
            }
        }
        
        // Sort Rows
        for(int i=0; i<R; i++){
            Arrays.sort(hist[i]);
            int[] temp = new int[C+1];
            for(int k=0; k<=C; k++){
                temp[k] = hist[i][C - k];
            }
            for(int k=0; k<=C; k++){
                hist[i][k] = temp[k];
            }
                 
        }
        int curr_area, max_area = 0;
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                curr_area = (j+1)*hist[i][j];
                max_area = Math.max(max_area, curr_area);
            }
        }
        return max_area;
    }
}
