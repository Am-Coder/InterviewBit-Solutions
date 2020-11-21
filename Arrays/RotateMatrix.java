public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = a.get(i).get(j);
                a.get(i).set(j,a.get(j).get(i));
                a.get(j).set(i,temp);
            }
        }
        for(int i=0; i<n; i++){
            int l = 0;
            int r = n-1;
            while(l<r){
                int temp = a.get(i).get(l);
                a.get(i).set(l,a.get(i).get(r));
                a.get(i).set(r,temp);
            
                l++;
                r--;
            }
        }
    }
}
