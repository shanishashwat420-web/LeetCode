class Solution {
public int minMoves(int[] nums) {
    int min = nums[0];
    int count = 0;
    for (int x : nums) {
         min = Math.min(min, x);
    }
    for (int x : nums) {
         count += (x - min);
        }

    return count;
    }
}
