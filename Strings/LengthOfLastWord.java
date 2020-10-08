public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        
        int n = A.length() - 1;
        StringBuilder sb = new StringBuilder();
        
        while(n>=0 && A.charAt(n) == ' '){
            n--;
        }
        if(n<0)
            return 0;
        for(int i=n; i>=0; i--){
            if(A.charAt(i) == ' '){
                break;
            }else{
                sb.append(A.charAt(i));
            }
        }
        String sol = sb.reverse().toString();
 
        return sol.length();
        
    }   
}           

