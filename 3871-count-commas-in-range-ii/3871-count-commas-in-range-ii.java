class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        long power = 1000;
        
        while (power <= n) {
            totalCommas += (n - power + 1);
            if (power > Long.MAX_VALUE / 1000) {
                break;
            }
            power *= 1000;
        } 
        return totalCommas;
    }
}
