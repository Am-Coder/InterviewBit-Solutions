class Pair {
    public int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class Quad implements Comparable<Quad>{
    public int x, y, z, w;

    Quad(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    
        @Override
    public int compareTo(Quad o) {
        // TODO Auto-generated method stub
        if(o.x == x){
            if(o.y == y){
                if(o.z == z){
                    return w - o.w;
                }
                return z - o.z;
            }
            return y - o.y;
        }
        return x - o.x;
    }    
   
}


public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
        int n = A.size();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = A.get(i);
        }
        ArrayList<ArrayList<Integer>> ans = quadTuple(arr, A.size(), B);
        return ans;
    }
    
    public static ArrayList<ArrayList<Integer>> quadTuple(int[] A, int n, int sum)
    {
        Map<Integer, List<Pair>> map = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        ArrayList<Quad> sol = new ArrayList<>();
        boolean found = false;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                int val = sum - (A[i] + A[j]);

                if (map.containsKey(val))
                {
                    for (Pair pair : map.get(val))
                    {
                        int x = pair.x;
                        int y = pair.y;

                        if ((x != i && x != j) && (y != i && y != j) )
                        {   found = true;
                            int[] aa = new int[4];
                            aa[0] = A[i];
                            aa[1] = A[j];
                            aa[2] = A[x];
                            aa[3] = A[y];
                            Arrays.sort(aa);
                            String ans  = aa[0] + " " + aa[1] + " "
                                        + aa[2] + " " + aa[3] + " $" ;
                            if(!hs.contains(ans)){
                                sol.add(new Quad(aa[0],aa[1],aa[2],aa[3]) );
                                hs.add(ans);
                            }
                                        
                        }
                    }
                }

                map.putIfAbsent(A[i] + A[j], new ArrayList<>());
                map.get(A[i] + A[j]).add(new Pair(i, j));
            }
        }
        ArrayList<ArrayList<Integer>> solu = new ArrayList<>();
        if(found){
            Collections.sort(sol);
            for(Quad an: sol){
                ArrayList<Integer> rr = new ArrayList<>();
                rr.add(an.x);
                rr.add(an.y);
                rr.add(an.z);
                rr.add(an.w);
                solu.add(rr);
            }
        }
        return solu;
    }
}
