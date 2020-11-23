public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int n = arrive.size();
        int r = 1;
        int max = 1;
        int j = 0;
        int i = 1;
        while(i<n && j<n){
            if(arrive.get(i) < depart.get(j)){
                r++;
                i++;
                
            }else{
                j++;
                r--;
            }
            max = Math.max(max,r);
        }
        
        if(max > K){
            return false;
        }else{
            return true;
        }
    }
}
