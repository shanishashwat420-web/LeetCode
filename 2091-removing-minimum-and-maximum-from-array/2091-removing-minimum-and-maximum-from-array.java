class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = -1;
        int maxIndex = -1;

        // Find min, max and their indices
        for (int i = 0; i < n; i++) {

            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        // Case 1: Delete both from front
        int case1 = Math.max(minIndex, maxIndex) + 1;

        // Case 2: Delete both from back
        int case2 = n - Math.min(minIndex, maxIndex);

        // Case 3: Delete min from front, max from back
        int case3 = (minIndex + 1) + (n - maxIndex);

        // Case 4: Delete max from front, min from back
        int case4 = (maxIndex + 1) + (n - minIndex);

        return Math.min(
            Math.min(case1, case2),
            Math.min(case3, case4)
        );
    }
}