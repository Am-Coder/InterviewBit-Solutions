

    public class Solution {
        public int bulbs(int[] A) {
            int zi = -1;
            int n = A.length;
            for(zi=0; zi<n; zi++){
                if(A[zi] == 0){
                    break;
                }
            }
            if(zi == n){
                return 0;
            }
            
            int cz = 0;
            int co = 0;
            for(int i=zi; i<n; i++){
                if(A[i] == 0){
                    cz++;
                    while(i<n && A[i] == 0){
                        i++;
                    }
                }
            }
            for(int i=zi; i<n; i++){
                if(A[i] == 1){
                    co++;
                    while(i<n && A[i] == 1){
                        i++;
                    }
                }
            }
            return cz + co;
        }
    }

