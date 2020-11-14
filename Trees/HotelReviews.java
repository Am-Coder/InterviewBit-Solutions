

    public class Solution {
        static class Pair{
            int x;
            int y;
            Pair(int x, int y){
                this.x = x;
                this.y = y;
            }
        }
        public ArrayList<Integer> solve(String A, ArrayList<String> B) {
            String[] arr = A.split("_");
            HashSet<String> hs = new HashSet<>();
            for(int i=0; i<arr.length; i++){
                hs.add(arr[i]);
            }
            ArrayList<Pair> imsol = new ArrayList<>();
            for(int i=0; i<B.size(); i++){
                String[] temp = B.get(i).split("_");
                int cou = 0;
                for(String str: temp){
                    if(hs.contains(str)){
                        cou++;
                    }
                }
                imsol.add(new Pair(i, cou));
            }
            
            Collections.sort(imsol, new Comparator<Pair>(){
                public int compare(Pair p1, Pair p2){
                    if(p1.y == p2.y){
                        return p1.x - p2.x;
                    }
                    return p2.y - p1.y;
                }
            });
            ArrayList<Integer> sol = new ArrayList<>();
            for(int i=0; i<imsol.size(); i++){
                sol.add(imsol.get(i).x);
            }
            
            return sol;
        }
    }

