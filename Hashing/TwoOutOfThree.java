public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();
        
        for(int num: A)
            a.add(num);
        for(int num: B)
            b.add(num);
        for(int num: C)
            c.add(num);
        
        HashSet<Integer> sol = new HashSet<>();
        for(int num: A){
            if((a.contains(num) && b.contains(num))||(b.contains(num) && c.contains(num))
            ||(a.contains(num) && c.contains(num))){
                sol.add(num);
            }
        }
        for(int num: B){
            if((a.contains(num) && b.contains(num))||(b.contains(num) && c.contains(num))
            ||(a.contains(num) && c.contains(num))){
                sol.add(num);
            }
        }
        for(int num: C){
            if((a.contains(num) && b.contains(num))||(b.contains(num) && c.contains(num))
            ||(a.contains(num) && c.contains(num))){
                sol.add(num);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num: sol)
            ans.add(num);
        Collections.sort(ans);
        return ans;
        
    }
}
