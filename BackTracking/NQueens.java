public class Solution {
    public ArrayList<ArrayList<String>> solveNQueens(int a) {
        temp = new ArrayList<>();
        arr = new ArrayList<>();
        for(int i=0; i<a; i++){
            temp.add(-1);
        }
        nqueen(0,a);
        return arr;
    }
    
    ArrayList<ArrayList<String>> arr;
    ArrayList<Integer> temp;
    
    public boolean is_safe(int i, int j){
        for(int k=0; k<i; k++){
            int srow = k;
            int scol = temp.get(k);
            if(scol != -1)
                if( scol == j || srow == i || Math.abs(i - srow) == Math.abs(j-scol) ){
                    return false;
                }
        }
        return true;
    }
    
    public void nqueen(int k, int n){
        
        for(int c=0; c<n; c++){
            if(is_safe(k,c)){
                temp.set(k,c);
                if(k == n-1){
                    ArrayList<String> sol = new ArrayList<>();
                    for(int m = 0; m<n; m++){
                        int C = temp.get(m);
                        String str = "";
                        for(int i=0; i<n; i++){
                            if(i == C)
                                str += "Q";
                            else
                                str += ".";
                        }
                        sol.add(str);
                    }
                    arr.add(sol);
                } else{
                    nqueen(k+1,n);
                }
            }
                
        }
    }

}
