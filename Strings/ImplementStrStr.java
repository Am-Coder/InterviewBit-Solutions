public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        int b = B.length();
        int a = A.length();
        
        if(a == 0 || b == 0 || b>a){
            return -1;
        }
        
        int ind =0;
        int st = -1;
        for(int i=0; i<a; i++){
            if(B.charAt(ind) == A.charAt(i)){
                int j=i;
                while(ind < b && j < a && B.charAt(ind) == A.charAt(j)){
                    ind++;
                    j++;
                }
                if(ind == b){
                    st = i;
                    break;
                }else{
                    ind = 0;
                    st = -1;
                }
            }
        }
        
        return st;
    }
}

