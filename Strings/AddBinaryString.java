public class Solution {
    public String addBinary(String A, String B) {
        
        String zero = "0";
        
        int n = A.length();
        int m = B.length();
        
        if(n<m){
            String temp = A;
            A = B;
            B = temp;
        }
        
        while(B.length() != A.length()){
            B = "0"+B;
        }
        int c = 0;        
        String sol = "";
        n = A.length();
        for(int i=n-1; i>=0; i--){
            int sum = (A.charAt(i) - '0') + (B.charAt(i) - '0') + c;
            if(sum == 0 || sum == 1){
                sol = String.valueOf(sum) + sol;
                c = 0;
            }else if(sum == 2){
                sol = "0" + sol;
                c = 1;
            }else{
                sol = "1" + sol;
                c = 1;
            }
        }
        if(c == 1){
            sol = "1" + sol;
        }
        return sol;
    }
}
