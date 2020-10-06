
public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        String min = A.get(0);
        int n = A.size();
        for(int i=1; i<n; i++){
            if(A.get(i).length() < min.length()){
                min = A.get(i);
            }
        }
        
        int st = 0;
        int end = min.length() - 1;
        while(st<=end){
            int mid = st + (end-st)/2 ;
            if(allContains(min,st,mid,A)){
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        
        return min.substring(0,end+1);
    }
    
    public boolean allContains(String min, int st, int end, ArrayList<String> A){
        int n = A.size();
        for(String str : A){
            for(int i=st; i<=end; i++){
                if(str.charAt(i) != min.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}

