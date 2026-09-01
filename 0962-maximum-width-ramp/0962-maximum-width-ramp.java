// class Solution {
//     public int maxWidthRamp(int[] nums) {
//         int n = nums.length;
//         int max =0;
//         for(int i =0;i<n;i++){
//             for(int j =i+1;j<n;j++){
//                 if(i<j && nums[i]<=nums[j]){
//                     int diff =Math.abs(i-j);
//                      max =Math.max(max,diff);
//                 }
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int minIndex = n;
        int max = 0;
        for (int i = 0; i < n; i++) {
            minIndex = Math.min(minIndex, arr[i][1]);
            max = Math.max(max, arr[i][1] - minIndex);
        }
        return max;
    }
}