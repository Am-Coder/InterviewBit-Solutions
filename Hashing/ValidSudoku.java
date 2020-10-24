public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> A) {
        HashSet<Character> hs = new HashSet<>();
        int n = A.size();
        
        // Row Chk
        for(int i=0; i<n; i++){
            char[] arr = A.get(i).toCharArray();
            for(int j=0; j<n; j++){
                if(arr[j] != '.'){
                    if(hs.contains(arr[j])){
                        return 0;
                    }else{
                        hs.add(arr[j]);
                    }
                }
            }
            hs.clear();
        }
        
        // Col Chk
        hs.clear();
        for(int i=0; i<n; i++){
        
            for(int j=0; j<n; j++){
                String str = A.get(j);
                if(str.charAt(i) != '.')
                    if(hs.contains(str.charAt(i))){
                        return 0;
                    }else{
                        hs.add(str.charAt(i));
                    }   
            }
            hs.clear();
        }
        
        // 3*3 Chk
        hs.clear();
        int[] rst = new int[]{0,3,6};
        int[] cst = new int[]{0,3,6};
        for(int l=0; l<3; l++){
            for(int m=0; m<3; m++){
                int r = rst[l];
                int c = cst[m];
                hs.clear();
                for(int i=r; i<r+3; i++){
                    for(int j=c; j<c+3; j++){
                        char ch = A.get(i).charAt(j);
                        if(ch != '.')
                            if(hs.contains(ch)){
                                return 0;
                            }else
                                hs.add(ch);
                    }
                }
            }
        }
        return 1;
    }
}
