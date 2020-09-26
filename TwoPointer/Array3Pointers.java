

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
            int a = 0, b = 0, c = 0;
            int l = A.size(), m = B.size(), n = C.size();
            int min = Integer.MAX_VALUE;
            while(a<l && b<m && c<n){
                int imini = Math.min(A.get(a), Math.min(B.get(b),C.get(c)));
                int imax = Math.max(A.get(a), Math.max(B.get(b), C.get(c)));
                if(imax - imini < min){
                    min = imax - imini;
                }
                if(min == 0)
                    break;
                
                if(A.get(a) == imini){
                    a++;
                }else if(B.get(b) == imini){
                    b++;
                }else{
                    c++;
                }
     
            }
     
            return min;
        }
    }

