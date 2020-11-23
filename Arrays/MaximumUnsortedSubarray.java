public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> clo = (ArrayList)A.clone();
        Collections.sort(clo);
        int mini = -1;
        int maxi = -1;
        for(int i=0; i<n; i++){
            if(clo.get(i) != A.get(i)){
                mini = i;
                break;
            }
        }
        
        for(int i=n-1; i>=0; i--){
            if(clo.get(i) != A.get(i)){
                maxi = i;
                break;
            }
        }
        
        ArrayList<Integer> sol = new ArrayList<>();
        if(maxi == -1){
            sol.add(-1);
        }else{
            sol.add(mini);
            sol.add(maxi);
        }
        return sol;
    }
}
