public class Solution {
    public String solve(String A) {
        
        String[] arr = A.split(" ");
        int n = arr.length;
        String sol = "";
        for(int i=n-1; i>=0; i--){
            if(arr[i].length() > 0)
                sol += arr[i]+" ";   
        }
        return sol.trim();
    }
}

