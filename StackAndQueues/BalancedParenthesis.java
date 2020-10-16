public class Solution {
    public int solve(String A) {
        char[] arr = A.toCharArray();
        int n = arr.length;
        int i=0;
        int op = 0;
        while(i<n){
            if(arr[i] == '('){
                op++;
            } else if(op > 0){
                op--;
            } else{
                return 0;
            }
            i++;
        }
        return op > 0 ? 0 : 1 ;
    }
}
