public class Solution {
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public String solve(String A) {
        char[] arr = A.toCharArray();
        int n = arr.length;
        for(int i=n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                int mini = i+1;
                int min = arr[i+1] - arr[i];
                for(int k=i+1; k<n; k++){
                    if(arr[k] - arr[i] < min && arr[k] - arr[i] > 0){
                        mini = k;
                        min = arr[k] - arr[i];
                    }
                }
                swap(arr, i, mini);
                Arrays.sort(arr, i+1, n);
                break;
            }
        }
        
        String ans = String.valueOf(arr);
        if(ans.equals(A)){
            return "-1";
        }
        return ans;
    }
    
}
