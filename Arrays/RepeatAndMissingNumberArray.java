public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> sol = new ArrayList<>();
        long n = A.size();
        long s1 = 0;
        long s2 = 0;
        
        for(int a: A){
            s1 += (long)a;
            s2 += (long)a*(long)a;
        }
        long o1 = n*(n+1)/2;
        long o2 = n*(n+1)*(2*n+1)/6;
        
        long d1 = s1 - o1;
        long d2 = s2 - o2;
        d2 /= d1;
        sol.add((int)(d1+d2)/2);
        sol.add((int)(-d1+d2)/2);
        return sol;
    }
}