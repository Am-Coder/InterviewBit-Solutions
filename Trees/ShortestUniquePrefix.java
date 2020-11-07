public class Solution {
    
    static class TrieNode {
        TrieNode[] chi = new TrieNode[26];
        boolean eow = false;
        int cou = 0;
    }
    
    static class Trie {
        TrieNode root = new TrieNode();
        
        public void add(char[] arr){
            TrieNode cur = root;
            for(int i=0; i<arr.length; i++){
                int val = arr[i] - 'a';
                if(cur.chi[val] == null){
                    cur.chi[val] = new TrieNode();
                }
                cur = cur.chi[val];
                cur.cou++;
            }
            cur.eow = true;
        }
        
        public String search(char[] arr){
            TrieNode cur = root;
            String ans = "";
            for(int i=0; i<arr.length; i++){
                int val = arr[i] - 'a';
                cur = cur.chi[val];
                ans += String.valueOf(arr[i]);
                if(cur.cou == 1){
                    break;
                }
            }
            return ans;
        }
    }
    
    public ArrayList<String> prefix(ArrayList<String> A) {
        Trie trie = new Trie();
        for(String str: A){
            trie.add(str.toCharArray());
        }
        ArrayList<String> sol = new ArrayList<>();
        for(String str: A){
            sol.add(trie.search(str.toCharArray()));
        }
        return sol;
    }
    
}
