class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (len == 0) return 0;
        
        for(int left = 0, right = left + len; right < haystack.length(); right++) {
            if (haystack.substring(left, right).equals(needle)) return left;
            left++;
        }
        
        // return haystack.indexOf(needle);
        return -1;
    }
}