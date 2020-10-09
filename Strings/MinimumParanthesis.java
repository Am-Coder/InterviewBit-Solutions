public class Solution {
    public int solve(String A) {
        char[] arr = A.toCharArray();
        int n = arr.length;
        int op = 0;
        int i=0;
        int cou = 0;
        while(i<n && arr[i] == ')'){
            cou++;
            i++;
        }
        while( i<n ){
            if(arr[i] == '('){
                op++;
            }else if(op>0){
                op--;
            }else{
                cou++;
            }
            i++;
        }
        
        return Math.abs(cou+op);
    }
}
