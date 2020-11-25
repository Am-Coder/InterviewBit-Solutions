public class Solution {
    
    public ArrayList<Integer> stepnum(int A, int B) {
        String str = String.valueOf(A);
        // String ss = "1";
        sol = new ArrayList<>();
        for(char ch='1'; ch<='9'; ch++){
            solve(String.valueOf(ch), A, B);
        }
        if(A == 0){
            sol.add(0);
        }
        Collections.sort(sol);
        return sol;
    }   
    
    ArrayList<Integer> sol;
    
    public void solve(String ss, int A, int B){
        
        int val = Integer.parseInt(ss);
        
        if(val > B){
            return;
        }
        
        if( val >= A && val <= B ){
            sol.add(val);
        }
        
        for(char ch='0'; ch<='9'; ch++){
            // char ch = '0'+i;
            if( Math.abs( ss.charAt(ss.length()-1) - ch ) == 1){
                solve(ss+String.valueOf(ch) , A, B);
            }
        }
    }

}       
        