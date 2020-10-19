public class Solution {
    public int braces(String s) {
        Stack<Character> st = new Stack<>(); 
        char[] str = s.toCharArray(); 
        for (char ch : str) { 
            if (ch == ')') { 
                char top = st.peek(); 
                st.pop(); 
  
                boolean flag = true; 
  
                while (top != '(') { 
  
                    if (top == '+' || top == '-'
                            || top == '*' || top == '/') { 
                        flag = false; 
                    } 
  
                    top = st.peek(); 
                    st.pop(); 
                } 
  
                if (flag == true) { 
                    return 1; 
                } 
            } else { 
                st.push(ch);  
            }  
        } 
        return 0; 
    }
}
