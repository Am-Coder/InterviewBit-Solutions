

    public class Solution {
        public int trailingZeroes(int A) {
            int num2 = 0;
            int num5 = 0;
            for(int i=1; i<=A; i++){
                num2 += getTwo(i);
                num5 += getFive(i);
            }
            return Math.min(num2,num5);
        }
        
        public int getTwo(int num){
            int cou = 0;
            while(num%2 == 0){
                cou++;
                num /= 2;
            }
            return cou;
        }
        
        
        public int getFive(int num){
            int cou = 0;
            while(num%5 == 0){
                cou++;
                num /= 5;
            }
            return cou;
        }
    }

