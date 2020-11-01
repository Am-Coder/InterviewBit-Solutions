public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        int n = A.size();
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        ArrayList<Integer> sol = new ArrayList<>();
        int i=0;
        int j=0;
        for(j=0; j<B; j++){
            hm.put(A.get(j), hm.getOrDefault(A.get(j),0)+1);
        }
        j--;
        while(j<n){

            sol.add(hm.size());
            
            j++;
            if(j<n){
                hm.put(A.get(j), hm.getOrDefault(A.get(j),0)+1);
            }
            if( hm.containsKey(A.get(i)) && hm.get(A.get(i)) == 1){
                hm.remove(A.get(i));
            }else if(hm.containsKey(A.get(i))){
                hm.put(A.get(i), hm.get(A.get(i)) - 1 );
            }
            i++;
        
        }

        return sol;
    }
}
