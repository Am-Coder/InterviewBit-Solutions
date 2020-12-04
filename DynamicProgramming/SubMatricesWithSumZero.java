public class Solution {
    public int solve(int[][] A) {
        if(A.length == 0)
            return 0;
        int r = A.length;
        int c = A[0].length;
        int count  = 0;
        
        for(int i=0; i<c; i++){
            int[] arr = new int[r];
            for(int j=i; j<c; j++){
                for(int k=0; k<r; k++){
                    arr[k] += A[k][j];
                }
                count += subzero(arr);
            }
        }
        
        return count;
    }
    public int subzero(int[] arr){
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(mp.containsKey(sum)) count+=mp.get(sum);
            mp.put(sum, mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
