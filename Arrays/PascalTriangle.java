public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        if(A == 0)
        return sol;
        for(int i=0; i<A; i++)
            sol.add(new ArrayList<Integer>());
        sol.get(0).add(1);
        
        for(int i=1; i<A; i++){
            for(int j=0; j<=i; j++){
                if( j==i || j==0){
                    sol.get(i).add(1);
                }else{
                    sol.get(i).add(sol.get(i-1).get(j) + sol.get(i-1).get(j-1));
                }
                
            }
        }
        return sol;
    }
}
