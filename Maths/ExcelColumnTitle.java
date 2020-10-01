public class Solution {
    public String convertToTitle(int A) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int num = A;
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            int rem = (num-1)%26;
            sb.append(str.charAt(rem));
            num = (num-1)/26;
        }
        String sol = sb.reverse().toString();
        return sol;
    }
}
