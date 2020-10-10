public class Solution {
    public String multiply(String A, String B) {
        int n = A.length();
        int m = B.length();
        char[] sol = new char[n+m];
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        for(int i=0; i<sol.length; i++)
            sol[i] = '0';
        
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                int num = (a[i]-'0')*(b[j]-'0') + (sol[i+j+1]-'0') ;
                sol[i+j+1] = (char)((num%10) + '0');
                sol[i+j] += (char)(num/10);
            }
        }
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i<sol.length; i++) 
            if(sol[i] != '0'){
                while(i<sol.length){
                    sb.append(sol[i]);
                    i++;
                }
                return sb.toString();
            }
        
        return "0";
    }
}


