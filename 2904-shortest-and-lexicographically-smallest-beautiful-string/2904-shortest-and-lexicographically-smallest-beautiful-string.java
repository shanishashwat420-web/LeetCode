class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                int count = 0;
                for (int x = 0; x < substr.length(); x++) {
                    if (substr.charAt(x) == '1') {
                        count++;
                    }
                }
                if (count == k) {
                    if (ans.equals("") ||
                        substr.length() < ans.length() ||
                        (substr.length() == ans.length() && substr.compareTo(ans) < 0)) {
                        ans = substr;
                    }
                }
            }
        }
        return ans;
    }
}