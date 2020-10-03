

    public class Solution {
        int max = 1000003;
        public int findRank(String A) {
            int perm = 1;
            int n = A.length();
            char[] arr = A.toCharArray();
            int[] count = new int[256];
            int[] fact = new int[n+1];
            fact[0] = 1;
            for(int i=1; i<=n; i++){
                fact[i] = ( (fact[i-1]%max) * (i%max) )%max;
            }
            for(int i=0; i<n; i++){
                count[arr[i]]++;
            }
            
            for(int i=1; i<256; i++){
                count[i] += count[i-1];
            }
            
            for(int i=0; i<n; i++){
                perm = (perm%max + (count[arr[i]-1]%max) * (fact[n-1-i]%max) )%max;
                updatecount(count, arr[i]);
            }
            return perm;
        }
        
        void updatecount(int[] count, char ch) 
        { 
            int i; 
            for (i = ch; i < 256; i++) 
                count[i]--; 
        } 
    }

