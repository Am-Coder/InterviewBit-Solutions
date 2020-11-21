public class Solution {
    void swap(ArrayList<Integer> ar, int i, int j)  
    { 
        int temp = ar.get(i); 
        ar.set(i, ar.get(j)); 
        ar.set(j, temp); 
    } 
    
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int i=0;
        int n= A.size();
        for(i=n-1; i>0; i--){
            if(A.get(i) - A.get(i-1) > 0){
                break;
            }
        }
        if(i==0){
            Collections.sort(A);
        }else{
            int x = A.get(i-1);
            int min = i;
            for(int j=i+1; j<n; j++){
                if(A.get(j) < A.get(min) && A.get(j)>x){
                    min = j;
                }
            }
            swap(A,min,i-1);
            Collections.sort(A.subList(i,n));
        }
        return A;
        
    }
}
