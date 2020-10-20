public class Solution {
    public String simplifyPath(String A) {
        Stack<String> st = new Stack<>();
        A = A.trim();
        String[] arr = A.split("/");
        int n = arr.length;
        for(int i=0; i<n; i++){
            String str = arr[i];
            if(str.equals(".")){
                
            }else if(str.equals("..")){
                if(!st.empty())
                    st.pop();
            }else{
                if(str.length()>0)
                st.push(str);
            }
        }
        String str = "";
        StringBuilder sb = new StringBuilder("");
        Stack<String> aux = new Stack<>();
        while(!st.empty()){
            aux.push(st.pop());
        }
        while(!aux.empty()){
            sb.append("/"+aux.pop());
        }
        str = sb.toString();
        if(str.length() == 0){
            return "/";
        }
        return str;
    }
}
