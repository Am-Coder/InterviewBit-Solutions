public class Solution {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        int m = B;
        
        int i = 0;
        int j = 0;
        
        int lw = 0;
        int max = 0;
        
        int len = A.size();
        
        int zc = 0;
        
        while(j < len){
            if(zc<=B){
                if(A.get(j) == 0){
                    zc++;
                }
                j++;
            }else{
                if(A.get(i) == 0){
                    zc--;
                }
                i++;
            }
            
            if((j-i)>max && zc <=B){
                max = j-i;
                lw = i;
            }
        }
        ArrayList<Integer> sol = new ArrayList<>();
        for(int k=0; k<max; k++){
            sol.add(k+lw);
        }
        return sol;
    }
}
