class Solution {
    public int reverse(int x) {
        int result = 0;
        
        while (x != 0) {
            int tail = x % 10;
            int r = (result * 10) + tail;
            if ((r - tail) / 10 != result) return 0;
            result = r;
            x = x/10;
        }
        return result;
    }
}