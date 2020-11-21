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
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        int st = newInterval.start, en = newInterval.end;
        int i, n= intervals.size();
        int flag = 0;
        ArrayList<Interval> ans = new ArrayList<>();
        for(i=0;i<n;i++){
            int start = intervals.get(i).start;
            int end= intervals.get(i).end;
            if(intervals.get(i).end <st && flag ==0){
                ans.add(intervals.get(i));
        
            } else{
                if(en < intervals.get(i).start) break;
                st = Math.min(st, start);
                en = Math.max(end, en);
                flag =1;
                continue;
            }
        }
            
        ans.add(new Interval(st,en));
        
        while(i<n){
            ans.add(intervals.get(i));
            i++;
         }
            
        return ans;
        
    }
}
