public class Solution {
    public boolean isPalindrome(int x) {
        
        String num = Integer.toString(x);
        
        if(x < 0) 
            return false;
        
        for(int i = 0; i < num.length() / 2; i++){
            char d1 = num.charAt(i);
            char d2 = num.charAt(num.length() - i - 1);
            if(d1 != d2)
                return false;
        }
        return true;
    }
}
