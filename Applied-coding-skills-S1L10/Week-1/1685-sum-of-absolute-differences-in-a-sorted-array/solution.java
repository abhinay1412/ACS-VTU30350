class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // 1. Calculate the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        // 2. Iterate through the array to calculate the differences
        for (int i = 0; i < n; i++) {
            // rightSum is the total sum minus the elements we've seen so far AND the current element
            int rightSum = totalSum - leftSum - nums[i];
            
            // Calculate differences for elements strictly to the left and right
            int leftDifferences = (i * nums[i]) - leftSum;
            int rightDifferences = rightSum - ((n - 1 - i) * nums[i]);
            
            // The total absolute difference for nums[i] is the sum of both parts
            result[i] = leftDifferences + rightDifferences;
            
            // Add current element to leftSum for the next iteration
            leftSum += nums[i];
        }
        
        return result;
    }
}