public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        int st = 0;
        int end = A.size() - 1;
        int s = -1;
        int e = -1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(s != -1){
                break;
            }
            if(A.get(mid) == B){
                if(mid - 1 >=0 && A.get(mid-1) == B){
                    end = mid - 1;
                }else{
                    s = mid;
                }
            }else if(A.get(mid) > B){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        st = 0;
        end = A.size() - 1;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(e != -1){
                break;
            }
            if(A.get(mid) == B){
                if(mid + 1 <= end && A.get(mid+1) == B){
                    st = mid + 1;
                }else{
                    e = mid;
                }
            }else if(A.get(mid) > B){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(s);
        arr.add(e);
        return arr;
    }
}
