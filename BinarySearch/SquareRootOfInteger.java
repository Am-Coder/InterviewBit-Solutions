public class Solution {
    public int sqrt(int x) {
        if(x == 1)
            return 1;
            
        int s = 1;
        int e = x/2;
        int ans = 0;
        while(s<=e){
            int mid  = s + (e-s)/2;
            if(mid*mid == x){
                ans = mid;
                break;
            }
            else if(mid*mid < x){
                s = mid + 1;
                ans = mid;
            }else{
                e = mid - 1;
            }
        }
        return ans;
     
    }
}
