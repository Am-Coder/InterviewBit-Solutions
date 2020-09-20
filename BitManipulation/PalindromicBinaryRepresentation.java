public class Solution {
    public int solve(int A) {
        if(A == 1)
            return 1;
        
        A = A - 1;    
        Queue<String> q = new LinkedList<>();
        q.add("11");
        while(A-->0){
            String curr = q.poll();
            
            if( A == 0 ){
                return Integer.parseInt(curr,2);
            }
            
            int len = curr.length();
            
            if(len%2 == 0){
                q.add(curr.substring(0,len/2)+"0"+curr.substring(len/2));
                q.add(curr.substring(0,len/2)+"1"+curr.substring(len/2));
            }else{
                char ch = curr.charAt(len/2);
                q.add(curr.substring(0,len/2)+ch+curr.substring(len/2));
            }
            
        }
        return -1;
    }
}
