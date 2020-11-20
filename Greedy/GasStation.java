public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int canCompleteCircuit(final int[] petrol, final int[] distance) {
        
        int n = petrol.length;
        Pair[] q1 = new Pair[n]; 
        for(int i=0; i<n; i++){
            q1[i] = new Pair(petrol[i],distance[i]);
        }
        if(n==1){
            return petrol[0] >= distance[0] ? 0:-1;
            
        }
        int pet = q1[0].first - q1[0].second;
        int sta = 0;
        int end = 1;
        while(end != sta || pet<0){
            while(pet<0 && sta !=end){
                pet -= q1[sta].first - q1[sta].second;
                sta = (sta + 1)%n ;
                
                if(sta == 0)
                    return -1;
            }
            pet += q1[end].first - q1[end].second;
            end = (end + 1)%n;
        }
        
        return sta;
    
    }
    
    public static class Pair implements Comparable<Pair> {
        int first;
        int second;
        public Pair( int a, int b ) {
            this.first = a;
            this.second = b;
        }

        @Override
        public int compareTo(Pair o) {
            // TODO Auto-generated method stub
            return o.first - first;
        }
        
        
    }    
    
    
}
