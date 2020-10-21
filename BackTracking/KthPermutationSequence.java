public class Solution {
    
    public String getPermutation(int A, int B) {
            ArrayList<Long> factorial = new ArrayList<>();
            factorial.add((long)1);
            for(int i=1;i<A;i++){
                long num = factorial.get(i-1)*i;
                if(num<B){
                    factorial.add(num);
                }
                else{
                    break;
                }
            }  
            while(factorial.size()<A){
                factorial.add((long)(B)+1);
            }
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<A;i++){
                arr.add(i+1);
            }
            String s = "";
            for(int i=A-1;i>=0;i--){
                long index = (B)/factorial.get(i);
                B =(int) (B%factorial.get(i));
                if(B==0){
                    if(index!=0){
                        index--;
                        int j = (int)(index);
                        s+=arr.get(j);
                            arr.remove(j);
                        break;
                    }
                    else{
                        index = 0;
                    }
                }
                
                int j = (int)(index);
                
                s+=arr.get(j);
                arr.remove(j);
            }
            for(int i=arr.size()-1;i>=0;i--){
                s+=arr.get(i);
            }
            return s;       
        
    }

}
