public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        // code here
        ArrayList<String> sol = new ArrayList<>();
        gen(s, sol, s.length(), "", 0, 0);
        ArrayList<String> finsol = new ArrayList<>();
        for (String ans : sol) {
            String[] st = ans.split("\\.");
            String ss = "";
            boolean found = true;
            for (int j = 0; j < st.length; j++) {
                long num = Long.parseLong(st[j]);
                if ( num > 255) {
                    found = false;
                    break;
                }
                ss += String.valueOf(num)+".";
            }
            if (found && ss.length() - 1 == ans.length())
                finsol.add(ss.substring(0,ss.length()-1));
        }
        Collections.sort(finsol);
        return finsol;
    }
    
    public void gen(String str, ArrayList<String> sol, int n, String ans, int i, int dc) {
        
        if (dc == 3 && i == n && ans.charAt(ans.length() - 1) != '.') {

            sol.add(ans);
            return;
        }
        
        if (i >= n || dc >= 4)
            return;
        
        ans += String.valueOf(str.charAt(i));
        gen(str, sol, n, ans + ".", i + 1, dc + 1);
        gen(str, sol, n, ans, i + 1, dc);
    }
}
