import java.math.BigInteger;
public class Solution {
    public int compareVersion(String A, String B) {
        int i ;
        for(i=A.length()-1; i>=0; i--){
            char ch = A.charAt(i);
            if(ch>='1' && ch<='9')
                break;
        }
        if(i==-1){
            A = "0";
        }else{
            A = A.substring(0,i+1);
        }
        
        for(i=B.length()-1; i>=0; i--){
            char ch = B.charAt(i);
            if(ch>='1' && ch<='9')
                break;
        }
        if(i==-1){
            B = "0";
        }else{
            B = B.substring(0,i+1);
        }
        
        
        String[] a = A.split("\\.");
        String[] b = B.split("\\.");
        
        int n = a.length;
        int m = b.length;
        
        i=0; 
        int j=0;
        int eq = 0;
        while(i<n && j<m){
            BigInteger n1 = new BigInteger(a[i]);
            BigInteger n2 = new BigInteger(b[j]);
            int res = n1.compareTo(n2);
            if (res > 0) {
                eq = 1;
                break;
            } else if (res < 0) {
                eq = -1;
                break;
            } else {
                eq = 0;
                i++;
                j++;
            }
        }
        if(eq == 0){
            if(n>m){
                while(i<n){
                    
                }
                return 1;
            }
            if(m>n){
                return -1;
            }
        }
        return eq;
    }
}
