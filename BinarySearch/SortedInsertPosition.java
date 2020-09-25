public class Solution {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int ind = Collections.binarySearch(a,b);
        if(ind < 0){
            return Math.abs(ind) - 1;
        }
        return ind;
    }
}

