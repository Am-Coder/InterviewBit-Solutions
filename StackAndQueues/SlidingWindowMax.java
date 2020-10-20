public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> arr, int k) {
        int n = arr.size();
        ArrayList<Integer> sol = new ArrayList<>();
        
        Deque<Integer> Qi = new LinkedList<Integer>(); 
  
        int i; 
        for (i = 0; i < k; ++i) { 
            while (!Qi.isEmpty() && arr.get(i) >= arr.get(Qi.peekLast())) 
                Qi.removeLast(); 
  
            Qi.addLast(i); 
        } 
  
        for (; i < n; ++i) { 
            sol.add(arr.get(Qi.peek())) ;
  
            while ((!Qi.isEmpty()) && Qi.peek() <= i - k) 
                Qi.removeFirst(); 
  
            while ((!Qi.isEmpty()) && arr.get(i) >= arr.get(Qi.peekLast())) 
                Qi.removeLast(); 
  
            Qi.addLast(i); 
        } 
        sol.add(arr.get(Qi.peek()));
        return sol;
    }
    
}
