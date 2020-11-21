/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> arr) {
            int n = arr.size();
            Collections.sort(arr, new Comparator<Interval>(){
                
                public int compare(Interval p1, Interval p2){
                      if(p1.start == p2.start){
                          return p1.end - p2.end;
                      }
                      return p1.start - p2.start;
                }
                
            });
            int i=1;
            int j=0;
            while(i < n && j<n){
                if(arr.get(j).end >= arr.get(i).start){
                    arr.get(j).end = Math.max(arr.get(j).end, arr.get(i).end);
                    arr.set(i, arr.get(j));
                    i++;
                }else{
                    j++;
                }
            }
            LinkedHashSet<Interval> hs = new LinkedHashSet<>();
            for(int k=0; k<n; k++){
                hs.add(arr.get(k));
            }
            ArrayList<Interval> sol = new ArrayList<>(hs);
            return sol;
    }
}

