public class Solution {
    public ArrayList<String> generateParenthesis(int A) {
        int oc = 0;
        int ec = 0;
        String st = "";
        ArrayList<String> sol = new ArrayList<>();
 
        gen(A,oc,ec,sol,st);
        Collections.sort(sol);
        return sol;
    }
    
    public void gen(int A, int oc, int ec, ArrayList<String> sol, String st){
        
        if(oc < ec || oc > A || ec > A){
            return;
        }
        
        if( (oc == ec) && oc + ec == 2*A){
            sol.add(st);
            return;
        }
        
        
        gen(A,oc,ec+1,sol,st + ")");
        
        gen(A,oc+1,ec,sol,st + "(");
    }
    
}

