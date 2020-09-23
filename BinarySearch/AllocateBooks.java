public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        
        int n = A.size();
        if(B>n)
            return -1;
        
        int st = Integer.MIN_VALUE;
        int end = 0;
        int res = -1;
        for(int num: A){
            st = Math.max(st,num);
            end += num;
        }
        while(st<=end){
            int mid = st + (end-st)/2;
            
            if(isValid(A,mid,B)){
                res = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return res;
    }
    
    public boolean isValid(ArrayList<Integer> A, int sum, int B){
        int stu = 1;
        int temp = 0;
        for(int i=0; i<A.size(); i++){
            temp += A.get(i);
            if(temp > sum){
                stu++;
                temp = A.get(i);
            }
            
        }
        if(stu>B){
            return false;
        }
        return true;
    }
}
