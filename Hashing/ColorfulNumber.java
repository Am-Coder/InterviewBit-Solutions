public class Solution {
    public int colorful(int A) {
        String num = String.valueOf(A);
        int n = num.length();
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0; i<n; i++){
            int n1 = num.charAt(i) - '0';
            if(hs.contains(n1)){
                return 0;
            }
            hs.add(n1);
            for(int j=i+1; j<n; j++){
                n1 = n1 * (num.charAt(j) - '0');
                if(hs.contains(n1))
                    return 0;
                hs.add(n1);
            }
        }
        return 1;
    }
}