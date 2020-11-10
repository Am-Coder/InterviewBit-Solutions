public class Solution {
        
        class Pair {
            
            int inf;
            
            int ht;
            
            Pair(int x, int y) {
                this.inf = x;
                this.ht = y;
            }
        }
        
        public ArrayList<Integer> order(ArrayList<Integer> A, ArrayList<Integer> B) {
            ArrayList<Pair> arr = new ArrayList<>();
            
            for (int i = 0; i < A.size(); i++) {
                arr.add(new Pair(B.get(i), A.get(i)));
            }
            
            Collections.sort(arr, new Comparator<Pair>() {
                
                public int compare(Pair p1, Pair p2) {
                    return -p1.ht + p2.ht;
                }
            });
            int n = arr.size();
            int max = arr.get(0).ht;
            int i = 0;
            ArrayList<Integer> sol = new ArrayList<>();
            while (i < n && arr.get(i).ht == max) {
                sol.add(max);
                i++;
            }
            while (i < n) {
                Pair p = arr.get(i);
                int gr = p.inf;
                int k = i;
                
                while (gr != k) {
                    k--;
                }
                
                if (k == i) {
                    sol.add(p.ht);
                } else {
                    sol.add(k, p.ht);
                }
                i++;
            }
            return sol;
            
        }
    }       
        