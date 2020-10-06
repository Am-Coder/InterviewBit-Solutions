public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isNumber(final String A) {
        String sub = A.trim();
        if(sub.length() == 0){
            return 0;
        }
        if(sub.length() == 1){
            if(sub.charAt(0) < '0' || sub.charAt(0) > '9')
                return 0;
            return 1;
        }
        
        sub = sub.charAt(0) == '-' || sub.charAt(0) == '+' ? sub.substring(1):sub;
        int flo = -1;
        int floc = 0;
        int expo = -1;
        int expoc = 0;
        
        int n = sub.length();
        boolean valid = true;;
        for(int i=0; i<n; i++){
            char ch = sub.charAt(i);
            if(ch == 'e'){
                expo = i;
                if(sub.charAt(i+1) == '-'){
                    i++;
                    expo=i;
                }
                expoc++;
                continue;
            }
            if(ch == '.'){
                flo = i;
                floc++;
                continue;
            }
            if(ch < '0' || ch > '9' || expoc > 1 || floc > 1){
                valid = false;
                break;
            }
        }
        if( !valid || (flo > expo && expo != -1) || 
        (Math.abs(flo-expo) == 1 && flo != -1 && expo != -1) || flo == n-1 || expo == n-1 ){
            return 0;
        }
        return 1;
    }
}
