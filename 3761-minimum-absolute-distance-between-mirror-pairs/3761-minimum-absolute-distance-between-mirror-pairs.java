class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> lastSeen = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;

        for (int j = 0; j < nums.length; j++) {
            if (lastSeen.containsKey(nums[j])) {
                minDistance = Math.min(minDistance, j - lastSeen.get(nums[j]));
            }
            lastSeen.put(reverse(nums[j]), j);
        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

    int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
