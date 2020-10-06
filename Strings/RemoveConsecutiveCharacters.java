public class Solution {
    public String solve(String A, int B) {
        char[] arr = A.toCharArray();
        int n = arr.length;
        char ch = arr[0];
        int i=1;
        int cou = 1;
        StringBuilder sol = new StringBuilder("");

        StringBuilder sb = new StringBuilder("");
        sb.append(ch);
        while(i<n){
            if(arr[i] == ch){
                sb.append(arr[i]);
                cou++;
            }else{
                if(cou != B){
                    sol.append(sb.toString());
                }
                sb.setLength(0);
                sb.append(arr[i]);
                ch = arr[i];
                cou = 1;
            }
            i++;
        }
        if(cou != B){
            sol.append(sb.toString());
        }
        return sol.toString();
    }
}
