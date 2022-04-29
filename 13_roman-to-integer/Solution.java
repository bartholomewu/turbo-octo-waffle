class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int result = 0;
        for (int x = 0; x < s.length() - 1; x++){
            if (romanMap.get(s.charAt(x)) < romanMap.get(s.charAt(x+1))) {
                result -= romanMap.get(s.charAt(x));
            } else {
                result += romanMap.get(s.charAt(x));
            }
        }
        return result + romanMap.get(s.charAt(s.length() - 1));
    }
}