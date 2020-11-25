public class Solution {
    public ArrayList<Integer> getRow(int A) {
        int c = 1;
        int j = A;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=j+1; i++){
            arr.add(c);
            c = (c*(j-i+1))/i;
        }
        return arr;
    }
}
