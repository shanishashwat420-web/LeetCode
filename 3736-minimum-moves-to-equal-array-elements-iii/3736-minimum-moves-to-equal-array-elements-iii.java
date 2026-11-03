class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max =nums[n-1];
        int min =nums[0];
        int count  =0;
        for(int i =0;i<n;i++){
            int diff =max-nums[i];
            count+=diff;
        }
        return count;
    }
}