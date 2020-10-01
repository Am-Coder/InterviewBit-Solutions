

    public class Solution {
        public int titleToNumber(String A) {
            int base = 26;
            int num = 0;
            int k = 0;
            int n = A.length();
            for(int i=n-1; i>=0; i--){
                int val = A.charAt(i) - 'A' + 1;
                num += val*(int)Math.pow(26,k);
                k++;
            }
            return num;
        }
    }

