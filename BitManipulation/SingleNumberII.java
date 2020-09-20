public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int one = 0, two = 0;
        for (int i = 0; i < A.size(); i++) {
            int one_ = (one ^ A.get(i)) & ~two;
            int two_ = A.get(i) & one | ~A.get(i) & two;
            one = one_;
            two = two_;
        }   
        return one;
    }
}
