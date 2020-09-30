public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        return atm(A,B) - atm(A,B-1);
    }
    
    
    // Subarrays with atmax B distinct integers
    int atm(ArrayList<Integer> A,int B){
        int n = A.size();
        int i= 0;
        int j= 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int cou = 0;
        while(j<n){
            hm.put(A.get(j), hm.getOrDefault(A.get(j), 0)+1);
            while(hm.size() > B){
                int val = hm.get(A.get(i));
                if(val == 1){
                    hm.remove(A.get(i));
                }else{
                    hm.put(A.get(i), --val);
                }
                i++;
            }
            
            cou += j-i+1;
            j++;
        }
        
        return cou;
    }
}
