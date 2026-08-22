class Solution {
    public int myAtoi(String s) {

        s = s.trim();
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int ans = 0;
        int sign = 1;
        int i = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
// overflow and iunderflow ko rukne kie lie nhi ti last time ke tarah wrong ans 
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            ans = ans * 10 + digit;
            i++;
        }
        return ans * sign;
    }
}