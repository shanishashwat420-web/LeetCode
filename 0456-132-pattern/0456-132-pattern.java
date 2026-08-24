// class Solution {
//     public boolean find132pattern(int[] nums) {
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     if (nums[i] < nums[k] && nums[k] < nums[j]) {
//                         return true;
//                     }
//                 }
//             }
//         }

//         return false;
//     }
// }


class Solution {
    public boolean find132pattern(int[] nums) {

        int n = nums.length;
        int second = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            if (nums[i] < second) {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                second = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}