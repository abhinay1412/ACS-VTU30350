class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int idx = linearSearch(nums2, nums1[i]);
            if(idx != -1) {
                ans[i] = nextGreater(nums2, idx + 1, nums1[i]);
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }
    private int linearSearch(int[] arr, int se) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == se) {
                return i;
            }
        }
        return -1;
    }
    private int nextGreater(int[] arr, int start, int se) {
        for(int i = start; i < arr.length; i++) {
            if(arr[i] > se) {
                return arr[i];
            }
        }
        return -1;
    }
}