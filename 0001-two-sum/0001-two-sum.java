// class Solution {
//     public int[] twoSum(int[] nums, int target) {
         
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                  return new int[]{i, j};
//                 }
                 
//             }
//         }
        
        
//         return new int[]{}; 
//     }
// }


class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int left = 0;

        while (left < n - 1) {
            int right = left + 1;
            while (right < n) {
                if (nums[left] + nums[right] == target) {
                    return new int[]{left, right};
                }
                right++;
            }
            left++;
        }
        return new int[]{};
    }
}