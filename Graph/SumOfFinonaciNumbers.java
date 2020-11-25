public class Solution {
    public int fibsum(int A) {
        if(A <= 0){
            return 0;
        }
        if(A == 1){
            return 1;
        }
        int a = 1;
        int b = 1;
        while(b <= A){
            int temp = b;
            b = b+a;
            a = temp;
            if(b > A){
                b = temp;
                break;
            }
        }
        
        return 1 + fibsum(A - b);
        
    }
}
