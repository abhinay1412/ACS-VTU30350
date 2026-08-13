class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                // If we find a 0, swap it to the 'low' boundary
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // If it's a 1, it's already in the correct middle section
                mid++;
            } else {
                // If we find a 2, swap it to the 'high' boundary
                swap(nums, mid, high);
                high--;
                // Note: We don't increment 'mid' here because the swapped 
                // element from 'high' needs to be evaluated next.
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}