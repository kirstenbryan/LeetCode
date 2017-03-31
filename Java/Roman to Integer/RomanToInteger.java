public class Solution {
    public int romanToInt(String s) {
        
        int sum = 0;
        int i = s.length() - 1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        while(i >= 1) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i - 1);
            int d1 = map.get(c1);
            int d2 = map.get(c2);
            sum += d1;
            if(d2 < d1) {
                sum -= d2;
                i -= 2;
            }
            else
                i--;
        }
        if(i == 0)
            sum += map.get(s.charAt(0));
        return sum;
    }
}
