

    public class Solution {
        public int lengthOfLongestSubstring(String A) {
            HashMap<Character,Integer> hs = new HashMap<>();
            int n = A.length();
            int max = 0;
            int i=0;
            int j=0;
            while(j<n){
                char ch = A.charAt(j);
                if(hs.containsKey(ch)){
                    max = Math.max(hs.size(),max);
                    int ind = hs.get(ch);
                    while(i<=ind && i<=j){
                        hs.remove(A.charAt(i));
                        i++;
                    }
                    hs.put(ch,j);
                    j++;
                }else{
                    hs.put(ch,j);
                    j++;
                }
            }
            max = Math.max(max,hs.size());
            return max;
        }
    }

