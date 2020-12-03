public class Solution {
    public int[] solve(int A, int[] B) {
        int mini = 0;
        int n =  B.length;
        for(int i=0; i<n; i++){
            if(B[i] < B[mini]){
                mini = i;
            }
        }

        int len = A/B[mini];
        int min = B[mini];
        
        int[] sol = new int[len];
        if(len == 0){
            return sol;
        }
        Arrays.fill(sol, mini);
        
        int k = 0;
        int tot = len*min;
        for(int i=0; i<mini; i++){
            int s1 = tot - min + B[i];
            if(s1 <= A){
                sol[k] = i;
                tot = s1;
                k++;
                i--;
            }
            if(k>=len)
                break;
        }
        return sol;
    }
}
