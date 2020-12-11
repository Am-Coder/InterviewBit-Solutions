public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[] A) {
        int n = A.length;
        HashSet<Long> coll = new HashSet<>();
        HashMap<Long,Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            coll.add((long)A[i]);
            // if(hm.containsKey)
            hm.put((long)A[i], hm.getOrDefault((long)A[i],0)+1);
        }
        int mlen = 1;
        for(long key: hm.keySet()){
            mlen = Math.max(mlen, hm.get(key));    
        }
        for(int i=0; i<n; i++){
            HashSet<Long> hs = new HashSet<>();
            for(int j=i+1; j<n; j++){
                if(A[j] - A[i] != 0)
                    hs.add((long)A[j]-(long)A[i]);
            }   
            // int len = 1;
            // long nn = A[i];
            for(long diff: hs){
                int len = 1;
                long nn = A[i];
                while(coll.contains(nn+diff)){
                    nn = nn+diff;
                    len++;
                }
                mlen = Math.max(mlen,len);
            }
            
        }
        return mlen;
    }
}
