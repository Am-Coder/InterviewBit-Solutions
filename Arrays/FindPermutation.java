public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        int min = 1;
        int max = B;
        ArrayList<Integer> sol = new ArrayList<>();
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == 'D'){
                sol.add(max);
                max--;
            } else {
                sol.add(min);
                min++;
            }
        }
        if(A.charAt(A.length() - 1) == 'D'){
            sol.add(min);
        }else{
            sol.add(max);
        }
        return sol;
    }
}
