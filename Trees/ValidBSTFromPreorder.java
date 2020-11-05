public class Solution {
    public int solve(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            int val = arr[i];
            int j = i+1;
            while(j<n){
                if(val-arr[j]>=0){
                    j++;
                }else{
                    break;
                }
            }
            while(j<n){
                if(val-arr[j]<0){
                    j++;
                }else{
                    break;
                }
            }
            if(j!=n){
                return 0;
            }
        }
        return 1;
    }
}
