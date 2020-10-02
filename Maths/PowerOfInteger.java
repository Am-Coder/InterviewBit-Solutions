

    public class Solution {
        public int isPower(int A) {
            if(A == 1){
                return 1;
            }
            
            for(int i=2; i*i<=A; i++){
                int num = A;
                int rem = num%i;
                while(rem == 0 && num!=1){
                    rem = num%i;
                    num /= i;
                }
                if(num == 1 && rem == 0){
                    return 1;
                }
                
            }
            return 0;
        }
    }

