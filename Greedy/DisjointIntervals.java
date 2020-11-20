public class Solution {
    static class Pair {
        int st;
        int end;
        Pair(int s, int e){
            this.st = s;
            this.end = e;
        }
    }
    public int solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            arr.add(new Pair(A.get(i).get(0), A.get(i).get(1)));
        }
        Collections.sort(arr, new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                if(p1.end == p2.end){
                    return p1.st - p2.st;
                }
               return p1.end - p2.end;
            } 
        });
        int ans = 1;
        int las = arr.get(0).end;
        for(int i=1; i<arr.size(); i++){
            if(arr.get(i).st <= las) continue;
            else{
                ans += 1;
                las = arr.get(i).end;
            }
        }
        return ans;
        
    }
}
