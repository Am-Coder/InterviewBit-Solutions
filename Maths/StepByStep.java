public class Solution {
    // if we move ith step in -ve directiond then 
    // sum -> sum - 2*i = A
    // sum - A = 2*i
    // That is there exists an i such that if taken in -ve
    // direction makes sum equal to A
    public int solve(int A) {
        A = Math.abs(A);
        int s = 0;
        int i=1;
        int step = 0;
        while(s < A || (s - A) % 2 != 0){
            s += i;
            step++;
            i++;
        }
        return step;
    }
    
}
