public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int A, int B) {
        sol = new ArrayList<>();
        Deque<Integer> temp = new LinkedList<Integer>();
        gen(1,A,B,temp);
        
        return sol;
    }
    ArrayList<ArrayList<Integer>> sol;
    public void gen(int cur, int A, int B, Deque<Integer> temp){
        if(temp.size() == B)
        {
            ArrayList<Integer> im = new ArrayList<>(temp);
            Collections.sort(im);
            sol.add(im);
            return;
        }        
        if(temp.size() > B || cur > A){
            return;
        }
        

        
        for(int i=cur; i<=A; i++){
            temp.addLast(i);
            gen(i+1,A,B,temp);
            temp.removeLast();
        }
    }
}
