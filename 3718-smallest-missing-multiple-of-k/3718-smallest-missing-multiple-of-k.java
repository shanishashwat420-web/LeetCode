class Solution {
    public int missingMultiple(int[] nums, int k) {
         int n = nums.length;
         List<Integer> list  = new ArrayList<>();
         for(int x:nums){
            list.add(x);
         }
         for(int i =1;i<=n+1;i++){
            int mul =i*k;
            if(!list.contains(mul)){
                return mul;
            }
         }
         return nums[n-1]*2;
    }
}