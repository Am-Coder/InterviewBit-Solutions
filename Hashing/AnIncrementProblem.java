

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        
        for(int i=0;i<A.size();i++){
            int first=A.indexOf(A.get(i));
           if(first>=0&& first<i){
               A.set(first,A.get(first)+1);
           }
            
        }
        return A;
    }
}

