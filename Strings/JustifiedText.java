public class Solution {
    public ArrayList<String> fullJustify(ArrayList<String> A, int L) {
        int st = 0;
        ArrayList<String> sol = new ArrayList<>();
        int n = A.size();
        while(st<n){
            int cou = A.get(st).length();
            int end = st+1;
            while( end < A.size() ){
                if(A.get(end).length() + cou + 1 > L) break;
                cou = A.get(end).length() + cou + 1;
                end++;
            }
            
            StringBuilder ans = new StringBuilder("");
            int diff = end - st - 1;
            
            // Either you are on last line or you can fit only one word
            if(end == A.size() || diff == 0){
                for(int i = st; i<end; i++){
                    ans.append(A.get(i)).append(" ");
                }
                ans.deleteCharAt(ans.length() - 1);
                for(int i=ans.length(); i<L; i++){
                    ans.append(" ");
                }
            } 
            // For other cases
            else{
                int spaces = (L - cou)/diff;
                int extraspace = (L - cou)%diff;
                for(int i=st; i<end; i++){
                    ans.append(A.get(i));
                    if(i < end -1){
                        for(int j=0; j <= spaces + (i - st < extraspace ? 1 : 0); j++){
                            ans.append(" ");
                        }
                    }
                }
            }
            sol.add(ans.toString());
            st = end;
        }
        return sol;
    }
}
