public class Solution {
    int max = (int)1e9 + 7;
    public int numDecodings(String A) {
        if(A.charAt(0) == '0')
            return 0;
        int n = A.length();
        char[] dig = A.toCharArray();
        int[] dp = new int[n+1];
        dp[0] = 1;
        
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            if(dig[i-1] == '0'){
                int num = 10*(dig[i-2]-'0');
                if(num <= 26 && num != 0){
                    dp[i] = ((dp[i]%max) + (dp[i-2]%max))%max;
                }else{
                    return 0;
                }
            }else{
                int num = 10*(dig[i-2]-'0') + (dig[i-1]-'0');
                if(num <= 26 && dig[i-2] != '0'){
                    dp[i] = ((dp[i]%max) + (dp[i-2]%max))%max;
                }
                    dp[i] = ((dp[i]%max) + (dp[i-1]%max))%max;
                
            }
        }
        
        return dp[n]%max;
    }
}
