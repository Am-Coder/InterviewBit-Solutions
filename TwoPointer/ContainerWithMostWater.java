

    public class Solution {
            
        public int maxArea(ArrayList<Integer> A) {
            if(A.size() == 1)
                return 0;
            int len = A.size();
            
            int l = 0; 
            int r = len -1; 
            int area = 0; 
          
            while (l < r) 
            { 
                area = Math.max(area,  
                            Math.min(A.get(l), A.get(r)) * (r - l)); 
                              
                if (A.get(l) < A.get(r)) 
                    l += 1; 
                      
                else
                    r -= 1; 
            }
            return area;
        }       
                
    }           

