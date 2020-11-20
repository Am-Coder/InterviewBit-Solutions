public class Solution {
    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> sol = new ArrayList<>();
        int n = A.length();
        int sum = 0;
        int max = sum;
        int l = -1;
        int r = -1;
        int tl = 0;
        int tr = -1;
        for(int i=0; i<n; i++){
            tr++;
            int a;
            if(A.charAt(i) == '0'){
                a = 1;
            }else{
                a = -1;
            }
            sum += a;
            if(sum < 0){
                sum = 0;
                tl = i+1;
                tr = i;
            }
            
            if(sum > max){
                max = sum;
                l = tl + 1;
                r = tr + 1;
            }
            
        }
        if(l<0){
            return sol;
        }
        
        sol.add(l);
        sol.add(r);
        return sol;
    }
}
