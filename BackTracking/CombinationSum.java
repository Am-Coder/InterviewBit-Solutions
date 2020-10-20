public class Solution {
    
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        temp = new LinkedList<>();
        sol = new ArrayList<>();
        hs = new HashSet<>();
        Collections.sort(A);
        int sum = 0;
        gen(sum, A, B);
        return sol;
    }
    
    ArrayList<ArrayList<Integer>> sol;
    Deque<Integer> temp;
    HashSet<String> hs;
    public void gen(int sum, ArrayList<Integer> A, int B){
        if(sum > B){
            return;
        }
        if(sum == B){
            ArrayList<Integer> im = new ArrayList<>(temp);
            Collections.sort(im);
            StringBuilder sb = new StringBuilder("");
            for(int i=0; i<im.size(); i++){
                sb.append(im.get(i));
                sb.append(" ");
            }
            String str = sb.toString();
            if(!hs.contains(str)){
                sol.add(im);
                hs.add(str);
            }
            return;
        }
        
        for(int i=0; i<A.size(); i++){
            temp.addLast(A.get(i));
            gen(sum + A.get(i), A, B);
            temp.removeLast();
        }
    }
    
}
