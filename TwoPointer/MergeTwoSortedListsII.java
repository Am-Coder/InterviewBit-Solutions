public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int n = a.size();
        int m = b.size();
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(a.get(i) > b.get(j)){
                arr.add(b.get(j));
                j++;
            }else{
                arr.add(a.get(i));
                i++;
            }
        }
        while(i<n){
            arr.add(a.get(i));
            i++;
        }
        while(j<m){
            arr.add(b.get(j));
            j++;
        }
        for(i=0; i<n; i++){
            a.set(i,arr.get(i));
        }
        for(i=n; i<m+n; i++){
            a.add(arr.get(i));
        }
        
    }
}
