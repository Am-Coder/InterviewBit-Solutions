public class Solution {
    public int[][] generateMatrix(int A) {
        
        int[][] sol = new int[A][A];
        if(A == 1){
            sol[0][0] = 1;
            return sol;
        }
        int num = 1;
        int hl = 0;
        int hr = A-1;
        int vt = 1;
        int vd = A-2;
        int row = 0;
        int col = 0;
        while(num <= A*A){
            for(int i=hl; i<=hr; i++){
                sol[row][i] = num;
                num++;
            }
            if(num > A*A)
                break;
            for(int i=vt; i<=vd; i++){
                sol[i][A - col - 1] = num;
                num++;
            }
            
            if(num > A*A)
                break;
            for(int i=hr; i>=hl; i--){
                sol[A - row - 1][i] = num;
                num++;
            }
            
            if(num > A*A)
                break;
            for(int i=vd; i>=vt; i--){
                sol[i][col] = num;
                num++;
            }
            if(num > A*A)
                break;
            hl++;
            hr--;
            vt++;
            vd--;
            row++;
            col++;
        }
        return sol;
        
    }
}
