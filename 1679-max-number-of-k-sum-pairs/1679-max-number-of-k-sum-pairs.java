// class Solution {
//     public int maxOperations(int[] nums, int k) {
//         int n = nums.length;
//         int count  =0;
//        for(int i =0;i<n;i++){
//         for(int j =i+1;j<n;j++){
//             if(nums[i]+nums[j]==k){
//             count++;
//             nums[i]=-1000;
//             nums[j]=-1000;
//             }
//         }
//        } 
//        return count;
//     }
// }






// methods 2
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            }
            else if (sum < k) {
                left++;
            }
            else {
                right--;
            }
        }

        return count;
    }
}