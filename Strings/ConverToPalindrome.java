public class Solution {
    public int solve(String A) {
        char[] arr = A.toCharArray();
        int i = 0;
        int j = arr.length-1;
        if(arr.length<=2){
            return 1;
        }
        int cou = 0;
        while(i<j){
            if(arr[i] == arr[j]){
                i++;
                j--;
            }else{
                cou++;
                if(cou > 1){
                    return 0;
                }
                if(arr[i+1] == arr[j]){
                    i++;
                }else if(arr[i] == arr[j-1]){
                    j--;
                }else{
                    return 0;
                }
            }
        }
        return 1;
    }
}
