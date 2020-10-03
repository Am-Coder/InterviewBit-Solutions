

    public class Solution {
        public int reverse(int A) {
            int num = A;
            int dig = 0;
            while(num != 0){
                dig++;
                num /= 10;
            }
            num = A;
            
            A = Math.abs(A);
            long ans = 0;
            while(A != 0){
                long rem = A%10;
                ans += rem*( (long) Math.pow(10,dig-1));
                if(ans > (long)Integer.MAX_VALUE){
                    return 0;
                }
                dig--;
                A /= 10;
            }
     
            return num < 0 ? -1*(int)ans:(int)ans;
        }
    }

