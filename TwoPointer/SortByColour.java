

    public class Solution {
        public void sortColors(ArrayList<Integer> A) {
            int[] arr = new int[3];
            for(int i=0; i<A.size(); i++){
                arr[A.get(i)]++; 
            }
            int j = 0;
            int n = A.size();
            for(int i=0; i<3; i++){
                while(j<n && arr[i] != 0){
                    A.set(j,i);
                    arr[i]--;
                    j++;
                }
            }
        }
    }

