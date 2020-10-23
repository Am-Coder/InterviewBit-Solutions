public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        int n = A.size();
        sol = new ArrayList<>();
        permute(A,0,n-1);
        return sol;
    }
    ArrayList<ArrayList<Integer>> sol;
    public void permute(ArrayList<Integer> arr, int l, int r){
        
        if(l==r){
            ArrayList<Integer> per = (ArrayList<Integer>)arr.clone();
            sol.add(per);
        }else{
            for(int i=l; i<=r; i++){
                swap(arr,l,i);
                permute(arr,l+1,r);
                swap(arr,l,i);
            }   
        }
 
    }
    
    public void swap(ArrayList<Integer> arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
}

