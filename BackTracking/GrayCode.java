public class Solution {
    public ArrayList<Integer> grayCode(int a) {
        sol = new ArrayList<>();
        num = 0;
        gengray(a);
        return sol;
    }
    
    ArrayList<Integer> sol;
    int num = 0;
    
    public void gengray(int a){
        if(a == 0){
            sol.add(num);
            return;
        }
        
        gengray(a-1);
        num = num ^ (1<<a-1);
        gengray(a-1);
    }
}
