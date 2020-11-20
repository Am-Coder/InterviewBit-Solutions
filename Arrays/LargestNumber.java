public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            arr.add(String.valueOf(A.get(i)));
        }
        Collections.sort(arr,new Comparator<String>(){
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });
        String ans = "";
        for(String ss: arr){
            ans += ss;
        }
        if(ans.charAt(0) == '0')
            return "0";
        return ans;
    }
}
