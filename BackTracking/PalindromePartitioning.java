public class Solution {
    public ArrayList<ArrayList<String>> partition(String a) {
        sol = new ArrayList<>();
        temp = new LinkedList<>();
        pp(a,0,a.length());
        return sol;
    }
    
    ArrayList<ArrayList<String>> sol;
    Deque<String> temp;
    private void pp(String input, int st, int end) 
    { 
        if (st >= end)  
        { 
            sol.add(new ArrayList<>(temp)); 
            return; 
        } 
  
        for (int i = st; i < end; i++)  
        { 
              
            if (isPalindrome(input, st, i)) 
            { 
                  
                temp.addLast(input.substring(st, i + 1)); 
  
                pp(input, i + 1, end); 
 
                temp.removeLast(); 
            } 
        } 
    } 
  
 
    private static boolean isPalindrome(String str, int i, int j) 
    { 
        while (i < j)  
        { 
            if (str.charAt(i++) != str.charAt(j--)) 
                return false; 
        } 
        return true; 
    } 
}

