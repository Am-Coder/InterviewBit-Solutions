public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestSubsequenceLength(final int[] arr) {
        int n = arr.length;
        int[] lis1 = new int[n];
        int[] lis2 = new int[n];
        
        Arrays.fill(lis1,1);
        Arrays.fill(lis2,1);
        
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[i] > arr[j] && lis1[i] <= lis1[j]){
                    lis1[i] = 1 + lis1[j];
                }
            }
        }
        
        for(int i = n-1; i>=0; i--){
            for(int j=n-1; j>i; j--){
                if(arr[i] > arr[j] && lis2[i] <= lis2[j]){
                    lis2[i] = 1 + lis2[j];
                }
            }
        }
        
        int sol = 0;
        
        for(int i=0; i<n; i++){
            sol = Math.max(sol, lis1[i] + lis2[i] - 1);
        }
        return sol;
    }
}
