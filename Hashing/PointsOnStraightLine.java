public class Solution {
    public int maxPoints(ArrayList<Integer> a, ArrayList<Integer> b) {
        int n = a.size();
        if(n <2){
            return n;
        }
        HashMap<Double,Integer> hm = new HashMap<>();
        int max = 2;
        for(int i=0; i<n; i++){
            hm.clear();
            int infislop = 1;
            int x = a.get(i);
            int y = b.get(i);
            
            for(int j=0; j<n; j++){
                if(j!=i){
                    int tx = a.get(j);
                    int ty = b.get(j);
                    if(x == tx){
                        infislop++;
                    }else{
                        double slope = ((double)y - (double)ty)/((double)x - (double)tx);
                        hm.put(slope, hm.getOrDefault(slope,1)+1);
                    }
                }    
            }
            
            for(double key: hm.keySet()){
                if(hm.get(key) > max){
                    max = hm.get(key);
                }
            }
            max = Math.max(max,infislop);
        }
        
        return max;
    }
}
