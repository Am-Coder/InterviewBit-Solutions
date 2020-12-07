public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> a) {
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        int n = a.size();
        for(int i=0; i<n; i++){
            sol.add(new ArrayList<Integer>());
        }
        sol.get(0).add(a.get(0).get(0));
        for(int i=1; i<n; i++){
            int m = a.get(i).size();
            for(int j=0; j<m; j++){
                if(j == 0 ){
                    sol.get(i).add(a.get(i).get(j) + sol.get(i-1).get(j));
                } else if(j == m-1){
                    sol.get(i).add(a.get(i).get(j) + sol.get(i-1).get(j-1));
                } else{
                    sol.get(i).add(a.get(i).get(j) + Math.min(sol.get(i-1).get(j), sol.get(i-1).get(j-1)));
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            ans = Math.min(ans, sol.get(n-1).get(i));
        }
        return ans;
    }
}
