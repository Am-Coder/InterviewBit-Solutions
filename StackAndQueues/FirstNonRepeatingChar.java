public class Solution {
    public String solve(String A) {
        char[] arr = A.toCharArray();
        int n= A.length();
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
        
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0) + 1);
            char ch = '#';
            for(char key: hm.keySet()){
                if(hm.get(key) == 1){
                    ch = key;
                    break;
                }
            }
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
