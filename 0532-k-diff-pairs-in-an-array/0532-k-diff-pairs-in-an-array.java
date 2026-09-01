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


class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}