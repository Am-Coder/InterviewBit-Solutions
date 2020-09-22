public class Solution {
    public int divide(int A, int B) {
        long a = (long)A;
        long b = (long)B;
        if(b == 0 || (b == -1 && a == Integer.MIN_VALUE)){
            return Integer.MAX_VALUE;
        }
        if(a == 0)
            return 0;
        boolean neg = false;
        if((a<0 && b>0) || (b<0 && a>0)){
            neg = true;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        int q = 0;
        while(a>=0){
            a -= b;
            if(a>=0)
                q++;
        }
        
        return neg ? -q : q;
    }
}
