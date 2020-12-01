public class Solution {
    public HashSet set ; 
    public ArrayList<String> ans; 

    public void mcm(String A,int i,String temp){

        if(i==A.length()){
            ans.add(temp.trim());
            return;
        }
        
        
        for(int j=1;i+j<=A.length();j++)
        {
        
           if( set.contains(A.substring(i,i+j)) ){ 
                mcm(A,i+j,temp+" "+A.substring(i,i+j));
            }
        }

    }

    public ArrayList wordBreak(String A, ArrayList B) {
        set=new HashSet<>();
        ans=new ArrayList<>();
        
        for(int i=0;i<B.size();i++){
        set.add(B.get(i));
        }
        mcm(A,0,"");
        
        return ans;
    
    }

}