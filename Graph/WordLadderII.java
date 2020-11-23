public class Solution {
        
        public ArrayList<ArrayList<String>> findLadders(String start, String end, ArrayList<String> C) {
            ArrayList<ArrayList<String>> sol = new ArrayList<>();
            int n = start.length();
            Queue<ArrayList<String>> q = new LinkedList<>();
            ArrayList<String> arr = new ArrayList<>();
            arr.add(start);
            q.add(arr);
            
            HashSet<String> hs = new HashSet<>();
            HashSet<String> vis = new HashSet<>();
            for (String str : C) {
                hs.add(str);
            }
            hs.add(start);
            hs.add(end);
            vis.add(start);
            int min = Integer.MAX_VALUE;
            while (!q.isEmpty()) {
                Queue<ArrayList<String>> aux = new LinkedList<>();
                ArrayList<String> level = new ArrayList<>();
                while (!q.isEmpty()) {
                    arr = q.poll();
                    String str = arr.get(arr.size() - 1);
                    if (str.equals(end)) {
                        sol.add(arr);
                        min = Math.min(min,arr.size());
                        continue;
                    }
                    for (int i = 0; i < n; i++) {
                        String st = str;
                        char[] carr = st.toCharArray();
                        for (char ch = 'a'; ch <= 'z'; ch++) {
                            if (ch != str.charAt(i)) {
                                carr[i] = ch;
                                st = String.valueOf(carr);
                                if (hs.contains(st) && !vis.contains(st)) {
                                    ArrayList<String> tmp = new ArrayList<>();
                                    for (String ss : arr) {
                                        tmp.add(ss);
                                    }
                                    tmp.add(st);
                                    aux.add(tmp);
                                    if (!st.equals(end))
                                        level.add(st);
                                }
                            }
                        }
                    }
                }
                vis.addAll(level);
                q.addAll(aux);
            }
            ArrayList<ArrayList<String>> ans = new ArrayList<>();
            
            for(ArrayList<String> abc: sol){
                if(abc.size() == min)
                    ans.add(abc);
            }
            return ans;
        }
    }
