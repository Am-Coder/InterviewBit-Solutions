public class Solution {
    public int pow(int x, int n, int d) {
        if( x == 0 ){
            return 0;
        }
        if( n==0 ){
            return 1;
        }
        
        long num = (long)x;
        long pow = (long)n;
        x = Math.abs(x);
        
        long a = 1;
        long temp = x%d;
        while(n > 0){
            if(n%2 != 0){
                a = (a*temp)%d;
            }
            n /= 2;
            temp = temp*temp;
            temp = temp%d;
            a = a%d;
        }
        return num < 0 && pow%2 != 0 ? d - (int)a: (int)a;
    }
}

