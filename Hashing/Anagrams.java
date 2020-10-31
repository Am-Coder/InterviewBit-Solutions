public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        int n = A.size();
        TreeMap<String,ArrayList<Integer>> tmap = new TreeMap<>();
        for(int i=0; i<n; i++){
            String str = A.get(i);
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String ss = String.valueOf(arr);
            if(tmap.containsKey(ss)){
                ArrayList<Integer> aa = tmap.get(ss);
                aa.add(i+1);
                tmap.put(ss,aa);
            }else{
                ArrayList<Integer> aa = new ArrayList<>();
                aa.add(i+1);
                tmap.put(ss,aa);
            }
            
        }
        
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        for(String key: tmap.keySet()){
            sol.add(tmap.get(key));
        }
        return sol;
    }
}
