public class Solution {
    public int romanToInt(String A) {
        
        int[] val = new int[255];
        val['I'] = 1;
        val['V'] = 5;
        val['X'] = 10;
        val['L'] = 50;
        val['C'] = 100;
        val['D'] = 500;
        val['M'] = 1000;
        int n = A.length();
        char min = A.charAt(n-1);
        int sum = 0;
        for(int i=0; i<n; i++){
            char ch = A.charAt(i);
            if(!chk(val,A,i+1,ch)){
                sum -= val[ch];
            }  else{
                sum += val[ch];
            }
        }   
        return sum;
            
    }
    public boolean chk(int[] val, String A, int ind, char min){
        for(int i=ind; i<A.length(); i++){
            if(val[min] < val[A.charAt(i)])
                return false;
        }
        return true;
    }
}           