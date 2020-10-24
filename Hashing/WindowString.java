public class Solution {
    public String minWindow(String s1, String s2) {
            int[] hmpat = new int[256];
            int[] hmstr = new int[256];
            for (int i = 0; i < s2.length(); i++) {
                hmpat[s2.charAt(i)]++;
            }
            
            char[] arr = s1.toCharArray();
            int ans = Integer.MAX_VALUE;
            int sti = 0;
            int start = -1;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                hmstr[arr[i]]++;
                
                if(hmpat[arr[i]] > 0 && hmstr[arr[i]] <= hmpat[arr[i]])
                    count++;
                if(count == s2.length()){
                    
                    while(hmpat[arr[sti]] == 0 || hmpat[arr[sti]] < hmstr[arr[sti]]){
                        if(hmpat[arr[sti]] < hmstr[arr[sti]] && hmpat[arr[sti]] != 0)
                            hmstr[arr[sti]]--;
                            
                        sti++;
                    }
                    int len = i - sti + 1;
                    if(len < ans){
                        ans = len;
                        start = sti;
                    }
                }
            }
            
            if (start == -1)
                return "";
            else
                return s1.substring(start,start+ans);
    }
}
