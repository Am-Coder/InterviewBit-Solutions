public class Solution {
    public int solve(int[][] A) {
        int n = A.length;
        int[] arr = new int[n];
        int[] dep = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = A[i][0];
            dep[i] = A[i][1];
        }
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i = 1; int j = 0;
        int plat = 1;
        int result = 1;
            
        while(i<n && j<n){
            if(arr[i]<dep[j]){
                plat++;
                i++;
            } else {
                plat--;
                j++;
            }
            if(plat>result){
                result = plat;
            }
        }
        
        return result;
    }
}
