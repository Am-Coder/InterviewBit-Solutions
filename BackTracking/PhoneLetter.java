

public class Solution {
    
    ArrayList<String> sol;
    HashMap<Integer,String> hm;
    public ArrayList<String> letterCombinations(String A) {
        sol = new ArrayList<>();
        hm = new HashMap<>();
        hm.put(0,"0");
        hm.put(1,"1");
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        
        int n = A.length();
        generate(A,0,n-1,"");
        Collections.sort(sol);
        return sol;
    }
    
    public void generate(String A, int l, int r, String ans){
        
 
        
        if(ans.length() > A.length()){
            return;
        }
        
        if(ans.length() == A.length()){
            sol.add(ans);
            return;
        }
        
        if(l>r){
            return;
        }
        
        StringBuilder sb = new StringBuilder(ans);
        String str = hm.get(A.charAt(l) - '0');
        int len = str.length();
        for(int i=0; i<len; i++){
            sb.append(str.charAt(i));
            generate(A,l+1,r,sb.toString());
            sb.deleteCharAt(sb.length() - 1);        
        }
        
    }
}

