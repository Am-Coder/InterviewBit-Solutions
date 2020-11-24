public class Solution {
        
        public int solve(String A, String B, String[] C) {
            HashSet<String> hs = new HashSet<>();
            HashSet<String> vis = new HashSet<>();

            for (int i = 0; i < C.length; i++) {
                hs.add(C[i]);
            }
            
            int n = B.length();
            
            Queue<String> q = new LinkedList<>();
            q.add(A);
            vis.add(A);
            int count = 0;
            while (!q.isEmpty()) {
                ArrayList<String> aux = new ArrayList<>();
                while (!q.isEmpty()) {
                    String str = q.poll();
                    if (str.equals(B))
                        return count + 1;
                    
                    for (int i = 0; i < n; i++) {
                        String st = str;
                        char[] arr = st.toCharArray();
                        for (char ch = 'a'; ch <= 'z'; ch++) {
                            if (ch != str.charAt(i)) {
                                arr[i] = ch;
                                st = String.valueOf(arr);
                                if (hs.contains(st) && !vis.contains(st)) {
                                    aux.add(st);
                                    vis.add(st);
                                }
                            }
                        }
                    }
                }
                count++;
                q.addAll(aux);
            }
            
            return 0;
        }
    }
