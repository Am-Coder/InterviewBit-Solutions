public class Solution {
    public int perfectPeak(ArrayList<Integer> A) {
        int n = A.size();
        if(n<=2){
            return 0;
        }
        int[] max = new int[n];
        max[0] = A.get(0);
        int[] min = new int[n];
        min[n-1] = A.get(n-1);
        for(int i=1; i<n; i++){
            max[i] = Math.max(max[i-1],A.get(i));
        }
        for(int i=n-2; i>=0; i--){
            min[i] = Math.min(min[i+1],A.get(i));
        }
        int cou = 0;
        for(int i=1; i<n-1; i++){
            if(A.get(i) > max[i-1] && A.get(i) < min[i+1])
                cou++;
        }
        return cou>0 ? 1:0;
    }
}
