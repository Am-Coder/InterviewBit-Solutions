

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public int atoi(final String A) {
            String a = A.trim();
            String str = "";
            boolean neg = false;
            if(a.length() > 0 && a.charAt(0) == '-'){
                neg = true;
                a = a.substring(1);
            } else if(a.length() > 0 && a.charAt(0) == '+'){
                neg = false;
                a = a.substring(1);
            }
            for(int i=0; i<a.length(); i++){
                char ch = a.charAt(i);
                if(ch>='0' && ch<='9'){
                    str += String.valueOf(ch);
                }else{
                    break;
                }
            }
            int n = str.length();
            if(n == 0)
                return 0;
            
            long ans = 0;
            int po = 0;
            for(int i=n-1; i>=0; i--){
                ans += (str.charAt(i) - '0')*((long)Math.pow(10,po));
                po++;
                if(ans > Integer.MAX_VALUE){
                    if(neg){
                        return Integer.MIN_VALUE;
                    }else{
                        return Integer.MAX_VALUE;
                    }
                }
            }
            return neg? -(int)ans:(int)ans;
            
        }
    }

