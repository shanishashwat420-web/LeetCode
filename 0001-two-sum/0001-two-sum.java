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


// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         int n = nums.length;
//         int left = 0;

//         while (left < n - 1) {
//             int right = left + 1;
//             while (right < n) {
//                 if (nums[left] + nums[right] == target) {
//                     return new int[]{left, right};
//                 }
//                 right++;
//             }
//             left++;
//         }
//         return new int[]{};
//     }
// }

// class Solution{
//     public int[] twoSum(int[] nums, int target) {
//         int n =nums.length;
//     Arrays.sort(nums);
//     int i =0;
//     int j = n-1;
//     while(i<j && i<n && j<n){
//         int sum =nums[i]+nums[j];
//         if(sum == target){
//             return new int[]{i,j};
//         }else if(sum<target){
//             i++;
//         }else{
//             j--;
//         }
//     }
//     return new int[]{};
//     }
// }


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaing = target - nums[i];
            if (map.containsKey(remaing)) {
                return new int[]{map.get(remaing), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}