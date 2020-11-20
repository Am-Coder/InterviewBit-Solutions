public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        String str = "";
        int n = A.size();
        
        int c = 1;
        ArrayList<Integer> sol = new ArrayList<Integer>();
        for(int i=n-1; i>=0; i--){
            int num = A.get(i);
            if(num < 9 ){
                sol.add(num+c);
                c = 0;
            }else if(num ==9){
                if(c==0)
                    sol.add(num);
                else{
                    sol.add(0);
                    c = 1;
                    
                }
            }
            
        }
        if(c == 1){
            sol.add(1);
        }
        Collections.reverse(sol);
        ArrayList<Integer> fin = new ArrayList<>();
        int i = 0;
        for(i=0; i<sol.size(); i++){
            if(sol.get(i) != 0){
                break;
            }
        }
        while(i<sol.size()){
            fin.add(sol.get(i));
            i++;
        }
        return fin;
    }
}
