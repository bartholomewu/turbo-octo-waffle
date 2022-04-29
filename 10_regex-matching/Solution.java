class Solution {
    Map<String, Boolean> cache;

    public boolean isMatch(String s, String p) {
        cache = new HashMap<>();
        return match(s, p);
    }

    private boolean match(String s, String p) {
        String key = s.length() + ":" + p.length();
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        boolean res = false;
        if (p.length() == 0) {
            res = s.length() == 0;
        } else if (p.length() > 1 && p.charAt(1) == '*') {
            if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
                res = match(s, p.substring(2)) || match(s.substring(1), p);
            } else {
                res = match(s, p.substring(2));
            }
        } else {
            if (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
                res = match(s.substring(1), p.substring(1));
            }
        }

        cache.put(key, res);
        return res;
    }
}