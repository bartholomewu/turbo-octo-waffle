class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int r = (result * 10) + tail;
            if (result != (r - tail) / 10) return 0;
            x /= 10;
            result = r;
        }

        return result;
    }
}