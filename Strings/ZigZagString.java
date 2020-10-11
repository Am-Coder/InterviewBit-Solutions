public class Solution {
    public String convert(String A, int B) {
        String[] arr = new String[B];
        if(B==1)
            return A;
        Arrays.fill(arr,"");
        int j=0;
        boolean dir = true;
        for(int i=0; i<A.length(); i++){
            arr[j] += String.valueOf(A.charAt(i));
            
            if(dir){
                j++;
                if(j>=B){
                    dir = false;
                    j--;
                    j--;
                }
            }else{
                j--;
                if(j<0){
                    dir = true;
                    j++;
                    j++;
                }
            }
            
        }
        
        String sol = "";
        for(j=0; j<B; j++){
            sol += arr[j];
        }
        return sol;
    }
}
