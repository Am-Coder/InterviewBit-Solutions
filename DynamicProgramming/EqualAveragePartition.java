public class Solution {    static int totalSize;
    ArrayList<Integer> res = new ArrayList<Integer>();
    ArrayList<Integer> original;
    boolean[][][] dp;
    
    public ArrayList<ArrayList<Integer>> avgset(ArrayList<Integer> A) {
        /* 
         * SUM_of_Set1 / size_of_set1 = SUM_of_Set2 / size_of_set2 
         * SUM_of_Set1 = SUM_of_Set2 * (size_of_set1 / size_of_set2)
         *
         * total_sum = Sum_of_Set1 + Sum_of_Set2
         * and size_of_set2 = total_size - size_of_set1 
         *
         * Sum_of_Set1 = (total_sum - Sum_of_Set1) * (size_of_set1 / (total_size - size_of_set1))
         * OR on simplifying, 
         *   total_sum / Sum_of_Set1 - 1 = (total_size - size_of_set1) / size_of_set1 
         *   total_sum / Sum_of_Set1 = total_size / size_of_set1 
         *   Sum_of_Set1 / size_of_set1 = total_sum / total_size 
         *
         *   Now we can just iterate on size_of_set1, and we would know the required Sum_of_Set1 
         */
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        totalSize = A.size();
        if(A == null || A.size() == 0)
            return result;
        
        
        Collections.sort(A);
        
        original = new ArrayList<Integer>(A);
        
        int totalSum = 0;
        for(int i = 0; i < A.size(); i++)
            totalSum += A.get(i);
        
        dp = new boolean[original.size()][totalSum + 1][totalSize];
        for(int i =0; i < original.size(); i++){
            for(int j = 0; j < totalSum + 1; j++){
                for(int k =0; k < totalSize; k++)
                    dp[i][j][k] = true;
            }
        }
            
            
            // We need to minimize size_of_set1. So, lets search for the first size_of_set1 which is possible.
        for(int i = 1; i < totalSize; i++){
            //SumOfSet1 has to be an integer
            if((totalSum * i) % totalSize != 0) continue;
            int sumOfSet1 = (totalSum * i) / totalSize;
            if(isPossible(0, sumOfSet1, i) == true){
                int ptr1 = 0;
                int ptr2 = 0;
                ArrayList<Integer> res1 = new ArrayList<Integer>(res);
                ArrayList<Integer> res2 = new ArrayList<Integer>();
                
                while(ptr1 < totalSize || ptr2 < res.size()){
                    if(ptr2 < res.size() && res.get(ptr2) == A.get(ptr1)){
                        ptr1++;
                        ptr2++;
                        continue;
                    }
                    res2.add(A.get(ptr1));
                    ptr1++;
                }
                result.add(res1);
                result.add(res2);
                return result;
            }
        }
        return result;
        
    }
    
    public boolean isPossible(int index, int sum, int sz){
        if(sz == 0){
            return sum == 0;
        }
        if(index >= totalSize) {
            return false;
        }
        if(dp[index][sum][sz] == false){
            return false;
        }
        if(sum >= original.get(index)){
            res.add(original.get(index));
            if(isPossible(index + 1, sum - original.get(index), sz - 1) == true)
                return true;
            res.remove(res.size() - 1);            
        }
        
        if(isPossible(index + 1, sum, sz))
            return true;
        dp[index][sum][sz] = false;
        return dp[index][sum][sz];
    }
    
}
