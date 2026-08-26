class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low =0;
        int high =nums.length-1;
        int n =nums.length;
         
        while(low<=high){
            int mid  =low+(high-low)/2;
            if (mid % 2 == 0) {
                if ( mid+1<nums.length && nums[mid] == nums[mid + 1]) {
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }else{
            if(nums[mid] == nums[mid - 1]){
                    low = mid + 1;
                }else{
                    high = mid;
                }
            }
        }
         return nums[low];
    }
}