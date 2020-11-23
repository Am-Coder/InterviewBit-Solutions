public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        int n = A.size();
        int[] maxi = new int[n];
        int[] mini = new int[n];

        
        maxi[n-1] = A.get(n-1);
        for(int i=n-2; i>=0; i--){
            maxi[i] = Math.max(maxi[i+1], A.get(i));
        }
        
        mini[0] = A.get(0);
        for(int i=1; i<n; i++){
            mini[i] = Math.min(mini[i-1], A.get(i));
        }
        
        int sol = 0;
        int i = 0;
        int j = 0;
        
        while(i<n && j<n){
            if(mini[i] <= maxi[j]){
                sol = Math.max(sol, j-i);
                j++;
            }else{
                i++;
            }
        }
        
        return sol ;
    }
}
