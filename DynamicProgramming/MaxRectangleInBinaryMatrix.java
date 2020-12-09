	public class Solution {
    public int maximalRectangle(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        for(int i=0; i<c; i++){
            int cou =0;
            for(int j=0; j<r; j++){
                if(A[j][i] == 1){
                    cou++;
                }else{
                    cou = 0;
                }
                A[j][i] = cou;
            }
        }
        int area = -1;
        for(int i=r-1; i>=0; i--){
            area = Math.max(area, getMaxArea(A[i],c));
        }
        return area;
    }
    
    public int getMaxArea(int[] hist, int n){
        Stack<Integer> s = new Stack<>();
        
        int max_area = 0;
        int tp;
        int area_with_top;
        
        int i = 0;
        while(i<n){
            if(s.empty() || hist[s.peek()] <= hist[i])
                s.push(i++);
            
            else {
                tp = s.peek();
                s.pop();
                area_with_top = hist[tp]*(s.empty() ? i: i - s.peek() -1);
                if(max_area < area_with_top)
                    max_area = area_with_top;
            }
        }
        
        while (s.empty() == false) 
        { 
            tp = s.peek(); 
            s.pop(); 
            area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1); 
       
            if (max_area < area_with_top) 
                max_area = area_with_top; 
        } 
       
        return max_area; 
    }

}
