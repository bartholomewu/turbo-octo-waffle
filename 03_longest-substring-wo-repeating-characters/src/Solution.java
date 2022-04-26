class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        int answer = 0;
        for (int left = 0, right = 0; right < s.length(); right++){
            if (hashMap.containsKey(s.charAt(right))) {
                left = Math.max(left, hashMap.get(s.charAt(right)) + 1);
            }
            hashMap.put(s.charAt(right), right);
            answer = answer < right - left + 1 ? right - left + 1 : answer;
        }
        return answer;
    }
}