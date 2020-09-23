

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public int search(final List<Integer> A, int B) {
            int ind = -1;
            
            int st = 0;
            int end = A.size() - 1;
            int mind = findMin(A,0,end);
            
            int in1 = binsearch(A, B, 0, mind - 1);
            int in2 = binsearch(A, B, mind, end);
            ind = Math.max(in1,in2);
            return ind;
        }
        public static int binsearch(List<Integer> arr, int B, int low, int high){
            
            int st = low;
            int end = high;
            int ind = -1;
            
            while(st<=end){
                int mid = st + (end - st)/2;
                if(arr.get(mid) == B){
                    ind = mid;
                    break;
                }else if(arr.get(mid) > B ){
                    end = mid - 1;
                }else{
                    st = mid + 1;
                }
            }
            return ind;
        }
        int findMin(List<Integer> arr, int low, int high){
            while(low<high){
                int mid = (low+high)/2;
                if(arr.get(mid) == arr.get(high))
                    high--;
                else if( arr.get(mid)>arr.get(high)){
                    low = mid+1;
                }else{
                    high = mid;
                }
            }
            return high;
        }
    }

