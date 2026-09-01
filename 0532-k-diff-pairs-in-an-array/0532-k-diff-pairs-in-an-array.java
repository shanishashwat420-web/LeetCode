// class Solution {
//     public int findPairs(int[] nums, int k) {
//         if (k < 0) return 0;
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
//         int count = 0;
//         for (int key : map.keySet()) {
//             if (k == 0) {
//                 if (map.get(key) >= 2) count++;
//             } else {
//                 if (map.containsKey(key + k)) count++;
//             }
//         }
//         return count;
//     }
// }


// class Solution {
//     public int findPairs(int[] nums, int k) {
//         
//         int n = nums.length;
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue;
//             }
//             for (int j = i + 1; j < n; j++) {
//                 if (Math.abs(nums[i] - nums[j]) == k) {
//                     count++;
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
// }

// wrong

// class Solution{
//      public int findPairs(int[] nums, int k){
//         int n =nums.length;
//         int left  =0;
//         int right =nums.length-1;
//         Arrays.sort(nums);
//         int count =0;
//         while(left<right){
//             int diff =Math.abs(nums[left]-nums[right]);
//             if(diff ==k){
//                 count++;
//             }else if(diff > k){
//                 right--;
//             }else{
//                 left++;
//             }
//         }
//         return count;
//      }
// }

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int count = 0;
        while (right < nums.length) {
            if (left == right) {
                right++;
            }
            else if (left > 0 && nums[left] == nums[left - 1]) {
                left++;
            }
            else if (nums[right] - nums[left] < k) {
                right++;
            }
            else if (nums[right] - nums[left] > k) {
                left++;
            }
            else {
                count++;
                left++;
                right++;
            }
        }
        return count;
    }
}