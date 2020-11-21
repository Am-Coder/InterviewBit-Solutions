

    public class Solution {
        public int maxp3(int[] A) {
            Arrays.sort(A);
            int n = A.length;
            if(n<3)
            return 0;
            int s1 = A[n-1]*A[n-2]*A[n-3];
            int s2 = A[0]*A[1]*A[2];
            int s3 = A[n-1]*A[0]*A[1];
            int s4 = A[n-1]*A[0]*A[n-2];
            
            s1 = Math.max(s1,s2);
            s2 = Math.max(s3,s4);
            return Math.max(s1,s2);
        }
    }

