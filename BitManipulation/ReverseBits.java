public class Solution {
    public long reverse(long a) {
        String ans = "";
        
        for(int i=0; i<32; i++){
            if(((1<<i)&a)>0){
                ans += "1";
            }else{
                ans += "0";
            }
        }
        return Long.parseLong(ans,2);
    }
}

