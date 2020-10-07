public class Solution {
    public String intToRoman(int number) {
        int num[] = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000}; 
        String sym[] = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
        int i=12;
        String ans = "";
        while(number>0) 
        { 
          int div = number/num[i]; 
          number = number%num[i]; 
          while(div-->0) 
          { 
            ans += sym[i]; 
          } 
          i--; 
        } 
        return ans; 
    }
}
