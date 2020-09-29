public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int n = A.size();
        int ans = 0;
        int minr = Integer.MAX_VALUE;
        for(int i=0; i+2<n; i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int im = A.get(i) + A.get(l) + A.get(r);
                int diff = Math.abs(im - B);
                if(diff == 0){
                    return B;
                }
                if(diff < minr){
                    minr = diff;
                    ans = im;
                }
                if(im < B){
                    l++;
                }else{
                    r--;
                }
                
            }
        }
        return ans;
    }
}
