public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        int cou = 0;
        while(j<n){
            if(sum + A.get(j)< B){
                sum += A.get(j);
                j++;
            }else{
                cou += j - i;
                sum -= A.get(i);
                i++;
            }
        }
        cou += ((j - i + 1)*(j - i))/2;
        return cou;
    }
}
