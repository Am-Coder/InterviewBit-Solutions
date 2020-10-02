

    public class Solution {
        public int isPalindrome(int A) {
            if(A<0){
                return 0;
            }
            int num = A;
            int dig = 0;
            int rev = 0;
            
            while(num != 0){
                dig++;
                num /= 10;
            }
            num = A;
            while(A != 0){
                int rem = A%10;
                rev += rem*((int)Math.pow(10,dig-1));
                dig--;
                A /= 10;
            }
            
            return num - rev == 0 ? 1:0;
        }
    }

