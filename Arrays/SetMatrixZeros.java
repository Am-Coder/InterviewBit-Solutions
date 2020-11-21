public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int r = a.size();
        int c = a.get(0).size();
        boolean sfr = false;
        boolean sfc = false;
        for(int i=0; i<c; i++){
            if( a.get(0).get(i) == 0){
                sfr = true;
                break;
            }
        }

          
        for(int i=0; i<r; i++){
            if(a.get(i).get(0) == 0){
                sfc = true;
                break;
            }
        }


        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                int val = a.get(i).get(j);
                if(val == 0){
                    a.get(i).set(0,0);
                    a.get(0).set(j,0);
                }
            }
        }
        
        for(int i=1; i<r; i++){
            if(a.get(i).get(0) == 0)
                for(int j=1; j<c; j++){
                    a.get(i).set(j,0);
                }
        }
        
        for(int i=1; i<c; i++){
            if(a.get(0).get(i) == 0)
                for(int j=1; j<r; j++){
                    a.get(j).set(i,0);
                }
        }
        if(sfr){
            for(int i=0; i<c; i++){
                a.get(0).set(i,0);
            }
        }
        if(sfc){
            for(int i=0; i<r; i++){
                a.get(i).set(0,0);
            }
        }
    }
}
