public class Solution {
    public String countAndSay(int n) {
            String str = "1";
            
            for(int i=1; i<n; i++){
                String sol = "";
                char ch = str.charAt(0);
                int cou = 0;
                for(int j=0; j<str.length(); j++){
                    if(str.charAt(j) != ch){
                        sol += String.valueOf(cou)+ch;
                        ch = str.charAt(j);
                        cou = 1;
                    }else{
                        cou++;
                    }
                }
                if(cou != 0)
                    sol += String.valueOf(cou)+ch; 
                str = sol;
            }
            
            return str;
    }
}
