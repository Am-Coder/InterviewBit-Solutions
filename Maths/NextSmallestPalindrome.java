public class Solution {
    public String solve(String A) {
        char[] arr = A.toCharArray();
        int i = 0, j = 0;
        int n = arr.length;
        while(i<n && arr[i] == '9'){
            i++;
        }
        if(i==n){
            StringBuilder sb = new StringBuilder("");
            sb.append(1);
            for(int k=1; k<=n-1; k++)
                sb.append(0);
            sb.append(1);
            return sb.toString();
        }
        int[] num = new int[n];
        for(i=0; i<n; i++)
            num[i] = arr[i] - '0';
        
        return genNextPalin(num, n);
    }
    
    public String genNextPalin(int[] num, int n){
        int mid = n/2;
        int i = mid-1;
        int j = n%2 == 0 ? mid : mid+1;
        boolean leftsm = false;
        while(i>=0 && num[i] == num[j]){
            i--;
            j++;
        }
        if(i<0 || num[i] < num[j]){
            leftsm = true;
        }
        
        while(i>=0){
            num[j++] = num[i--];
        }
        
        if(leftsm){
            int cary = 1;
            if(n%2 == 1){
                num[mid] += 1;
                cary = num[mid]/10;
                num[mid] %= 10;
            }
            i = mid-1;
            j = n%2 == 0 ? mid : mid+1;
            while(i>=0 && cary>0){
                num[i] = num[i] + cary;
                cary = num[i]/10;
                num[i] %= 10;
                num[j] = num[i];
                i--;
                j++;
            }
        }
        StringBuilder sb = new StringBuilder("");
        for(i=0; i<n; i++){
            sb.append(num[i]);
        }
        return sb.toString();
    }
}
