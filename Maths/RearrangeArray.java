public class Solution {
    public void arrange(ArrayList<Integer> A) {
        
        int i=0;
        int n = A.size();
        int max = n;
        
        while(i<n){
            int a = A.get(A.get(i))%max;
            int b = A.get(i)%max;
            A.set(i, b + a*max);
            i++;
        }
        for(i=0; i<n; i++){
            A.set(i,A.get(i)/max);
        }
        
    }
}
