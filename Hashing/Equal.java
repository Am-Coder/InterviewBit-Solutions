public class Solution {
    public ArrayList<Integer> equal(ArrayList<Integer> A) {
        int n = A.size();
        HashMap<Integer, ArrayList<Pair>> hm = new HashMap<>();
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum = A.get(i) + A.get(j);
                if(!hm.containsKey(sum)){
                    ArrayList<Pair> arr = new ArrayList<>();
                    arr.add(new Pair(i,j));
                    hm.put(sum,arr);
                }else{
                    ArrayList<Pair> arr = hm.get(sum);
                    arr.add(new Pair(i,j));
                    hm.put(sum,arr);
                }
                
            }
        }
        ArrayList<Integer> sol = new ArrayList<>();
        for(int key: hm.keySet()){
            ArrayList<Pair> arr = hm.get(key);
            if(arr.size() >=2){
                Pair p1 = arr.get(0);
                Pair p2 = null;
                int k = 1;
                while(k<arr.size()){
                    p2 = arr.get(k);
                    if(p1.a != p2.a && p1.b != p2.b && p1.a != p2.b && p1.b != p2.a){
                        break;
                    }
                    p2 = null;
                    k++;
                }
                if(p2 != null){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(p1.a);
                    temp.add(p1.b);
                    temp.add(p2.a);
                    temp.add(p2.b);
                    if(sol.size() == 0){
                        sol = temp;
                    }else{
                        if(sol.get(0) > temp.get(0)){
                            sol = temp;
                        }else if(sol.get(0) == temp.get(0) && sol.get(1) > temp.get(1)){
                            sol = temp;
                        }else if(sol.get(2) > temp.get(2) && sol.get(0) == temp.get(0) &&
                            sol.get(1) == temp.get(1)){
                               sol = temp; 
                        }else if(sol.get(3) > temp.get(3) && sol.get(0) == temp.get(0) &&
                        sol.get(1) == temp.get(1) && sol.get(2) == temp.get(2)){
                            sol = temp;
                        }
                        
                    }
                }
            }
        }
        
        return sol;
    }
    
    public class Pair{
        int a;
        int b;
        
        Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
        
    }
}
