public class Solution {
    
    int MOD = 10000003;
    
    public int seats(String A) {
        int i = 0;
        int j = A.length()-1;
        int countXI = 0;
        int countXJ = 0;
        int sumDotI = 0;
        int sumDotJ = 0;
        long total = 0;
        while (i < j) {
            if (A.charAt(i) == '.') {
                i++;
                sumDotI++;
            } else if (A.charAt(j) == '.') {
                j--;
                sumDotJ++;
            } else {
                total += countXI*sumDotI + countXJ*sumDotJ;
                countXI++;
                countXJ++;
                sumDotI = 0;
                sumDotJ = 0;
                i++;
                j--;
            }
        }
        
        if (i == j && A.charAt(i) == '.') {
            sumDotI++;
        }
        total += countXI*sumDotI + countXJ*sumDotJ;
        
        return (int)(total%10000003);
        
    }
}
