class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Step 1: Calculate total sum of array elements
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int prefixSum = 0;
        
        // Step 2: Compute absolute difference sums in a single pass
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int suffixSum = totalSum - prefixSum - num;
            
            // Combining left and right contributions directly into one formula:
            result[i] = (num * i - prefixSum) + (suffixSum - num * (n - 1 - i));
            
            prefixSum += num;
        }
        
        return result;
    }
}