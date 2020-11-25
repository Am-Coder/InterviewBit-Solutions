public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> sol = new ArrayList<>();
        int i=0;
        for(i=0; i<A.size(); i++)
            if(A.get(i)>=0)
                break;
                
        int n = A.size();
        int j = i-1;
        while( i<n && j>=0 ){
            if(A.get(i) < Math.abs(A.get(j))){
                sol.add(A.get(i)*A.get(i));
                i++;
            }else {
                sol.add(A.get(j)*A.get(j));
                j--;
            }
        }
        while(i<n){
            sol.add(A.get(i)*A.get(i));
            i++;
        }
        while(j>=0){
            sol.add(A.get(j)*A.get(j));
            j--;
        }
        return sol;
    }
}
