class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> x = new Stack<Character>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                x.push(')');
            } else if (c == '{') {
                x.push('}');
            } else if (c == '[') {
                x.push(']');
            } else if (x.isEmpty() || x.pop() != c) {
                return false;
            }
        }
        return x.isEmpty();
    }
}