class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) return 0; 
        HashMap<Character, Integer> sign = new HashMap<>();
        sign.put('-', -1);
        sign.put('+', 1);
        
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        
        int pos = 1;
        long result = 0;
        
        int index = 0;
        while (index < s.length() && s.charAt(index) == ' '){
            index++;
        }
        
        if (index < s.length() && sign.containsKey(s.charAt(index)) ) {
            pos *= sign.get(s.charAt(index));
            index++;
        }
        
        int right = s.length();
        for (int i = index; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                right = i;
                break;
            }
        }
        
        String digits = s.substring(index, right);
        for (char r : digits.toCharArray()) {
            if (map.containsKey(r)) result = result * 10 + map.get(r);
            if (result > Integer.MAX_VALUE){
                return pos > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return (int) result * pos;
    }
}