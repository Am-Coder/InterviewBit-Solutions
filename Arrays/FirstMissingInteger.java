public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int st = 0;
        int end = A.size() - 1;
        
        while(st <= end){
            if(A.get(end)>0){
                int temp = A.get(end);
                A.set(end,A.get(st));
                A.set(st,temp);
                st++;
            }else{
                end--;
            }
        }

        for(int k=0; k<st; k++){
            int num = Math.abs(A.get(k));
            if(num <= st && A.get(num-1) > 0){
                A.set(num - 1,-1*A.get(num-1));
            }
        }
        for(int i=0; i<st; i++){
            if(A.get(i) > 0){
                return i+1;
            }
        }
        return st + 1;
    }
}
