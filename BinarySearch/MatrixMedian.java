public class Solution {
    public int findMedian(ArrayList<ArrayList<Integer>> mat) {
        
        // code here    
        int r = mat.size();
        int c = mat.get(0).size();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<r; i++){
            min = Math.min(min,mat.get(i).get(0));
            max = Math.max(max,mat.get(i).get(c-1));
        }
        int des = (r*c + 1)/2;
        while(min<max){
            
            int mid = min + (max-min) / 2;
            int get = 0;
            int place = 0;
            
            for(int i=0; i<r; i++){
                get = Collections.binarySearch(mat.get(i), mid);
                if(get<0){
                    get = Math.abs(get) - 1;
                } else{
                    while(get < mat.get(i).size() && mat.get(i).get(get) == mid){
                        get += 1;
                    }
                }
                place = place + get;
                
                
            }
            if(place < des){
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        
        return min;
    
    }
}
