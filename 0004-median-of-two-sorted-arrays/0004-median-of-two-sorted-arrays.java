class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] arr = new int[m+n];
        double median =0;

        for(int i =0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i =0;i<n;i++){
            arr[m+i]=nums2[i];
        }
        Arrays.sort(arr);
        
        int total = m + n;

        if (total % 2 != 0) {
            median = arr[total / 2];
        } else {
            median = (arr[total / 2 - 1] + arr[total / 2]) / 2.0;
        }
        return median;
    }
}