public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        hs = new HashSet<>();
        gen(0,A,temp,sol);
        
        return sol;
    }
    
    HashSet<String> hs;
    public void gen(int l, ArrayList<Integer> A, ArrayList<Integer> temp, ArrayList sol){
        
        StringBuilder sb = new StringBuilder("");
        Collections.sort(temp);
        for(int i=0; i<temp.size(); i++){
            sb.append(temp.get(i));
            sb.append(" ");
        }
        String str = sb.toString();
        if(!hs.contains(str)){
            sol.add((ArrayList<Integer>)temp.clone());
            hs.add(str);
        }
        
        for(int i=l; i<A.size(); i++){
            temp.add(A.get(i));
            gen(i+1,A,temp,sol);
            temp.remove(temp.size()-1);
        }
    }
    
}
