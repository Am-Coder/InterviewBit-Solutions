public class Solution {
    public int solve(String A) {
        char[] arr = A.toCharArray();
        int i=0;
        int j=arr.length-1;
        int cou=0;
        while(i<=j){
            if(arr[i] == arr[j]){
                if(j==arr.length - 1)
                    cou = i;
                i++;
                j--;
            }else{
                i++;
                j = arr.length - 1;
            }
        }
        return cou;
    }

}
