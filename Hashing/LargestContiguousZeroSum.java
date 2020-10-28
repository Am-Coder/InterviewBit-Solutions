public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        int n = A.size();
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> sol = new ArrayList<>();
        int sum = 0;
        int st = -1;
        int end = -1;
        int si = 0;
        hm.put(0,-1);
        for(int i=0; i<n; i++){
            sum += A.get(i);
            if(hm.containsKey(sum)){
                int stm = Math.min(i,hm.get(sum));
                int endm = Math.max(i,hm.get(sum));
                if(endm - stm > si){
                    si = endm - stm;
                    st = stm+1;
                    end = endm;
                }
            }
            if(!hm.containsKey(sum))
                hm.put(sum,i);
        }
        if(st != -1 && end != -1)
            for(int i=st; i<=end; i++){
                sol.add(A.get(i));
            }
        
        return sol;
    }
}

