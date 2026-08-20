// class Solution {
//     public int triangleNumber(int[] nums) {
//         int n =nums.length;
//         int count =0;
//         Arrays.sort(nums);
//         for(int i =0;i<n;i++){
//             for(int j =i+1;j<n;j++){
//                 for(int k =j+1;k<n;k++){
//                     if(nums[i]+nums[j]>nums[k]){
//                         count++;
//                     }
//                 }
//             }
//         }https://leetcode.com/_next/static/images/dark-pending-f313d6fe32951fb6b4d48ad3ee4f3821.gif$0
//         return count;
//     }
// }

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int j = 0;
            int k = i - 1;

            while (j < k) {
                if (nums[j] + nums[k] > nums[i]) {
                    count += k - j;
                    k--;
                } else {
                    j++;
                }
            }
        }
        return count;
    }
}