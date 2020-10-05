public class Solution {
    public int solve(int A, int B) {
        int x = A;
        int y = B;
        int cou = 0;
        while(x+1<=8 && y+1<=8){
            cou++;
            x++;
            y++;
        }
        
        x = A;
        y = B;
        while(x-1>0 && y-1>0){
            cou++;
            x--;
            y--;
        }
        
        x = A;
        y = B;
        while(x+1<= 8 && y-1>0){
            cou++;
            x++;
            y--;
        }
        
        x = A;
        y = B;
        while(x-1>0 && y+1<=8){
            cou++;
            x--;
            y++;
        }
        return cou;
    }
}
