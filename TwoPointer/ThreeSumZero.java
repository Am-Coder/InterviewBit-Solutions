public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        if(A.size()<3){
            return sol;
        }
        Collections.sort(A);
        HashSet<String> hset = new HashSet<>();
        int n = A.size();
        for(int i=0; i<n; i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                long temp = (long)A.get(i) + (long)A.get(l) + (long)A.get(r);
                if(temp == 0){
                    ArrayList<Integer> im = new ArrayList<>();
                    im.add(A.get(i));
                    im.add(A.get(l));
                    im.add(A.get(r));
                    Collections.sort(im);
                    String str = String.valueOf(im.get(0)) + " " + 
                                String.valueOf(im.get(1)) + " " +
                                String.valueOf(im.get(2)) ;
                    if(!hset.contains(str)){
                        sol.add(im);
                        hset.add(str);
                    }
                    l++;
                    r--;
                }else if(temp < 0){
                    l++;
                }else{
                    r--;
                }
            }

        }
        return sol;
    }
}
